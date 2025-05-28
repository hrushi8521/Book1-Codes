package q4;

public class Main44 {
	public static void main(String[] args) {
		EmpPojo empPojo = new EmpPojo();
		empPojo.setId(10);
		empPojo.setName("Tom");
		empPojo.setSalary(1000);
		
		System.out.println("Employee id is: "+empPojo.getId());
		System.out.println("Employee name is: "+empPojo.getName());
		System.out.println("Employee salary is: "+empPojo.getSalary());
	}
}
