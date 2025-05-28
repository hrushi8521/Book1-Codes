package q1;

class Emp{
	String name;
	int id;
	double salary;
	String address;
	
	void displayinfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(address);
	}
	
	public Emp(String name, int id, double salary, String address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
}


public class Main1 {
	public static void main(String[] args) {
		Emp emp=new Emp("tom", 100, 200, "Malad");
		emp.displayinfo();//Using displayinfo()
		System.out.println(emp);// using toString
	}
}
