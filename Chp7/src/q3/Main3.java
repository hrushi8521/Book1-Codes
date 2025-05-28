package q3;

class Employee implements Cloneable {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Main3 {
	public static void main(String[] args) {
		Employee employee = new Employee(10, "Tom");
		System.out.println("Employee: " + employee);

		try {
			Employee employeeclone = (Employee) employee.clone();
			System.out.println("Emplyoee clone: " + employeeclone);

		} catch (Exception e) {
			System.out.println(e);
		}
		

	}
}
