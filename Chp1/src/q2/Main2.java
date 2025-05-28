package q2;

class Emp{
	int id = 20;
	double salary = 20000;
	static String companyname = "SDAC"; 
	static String branch = "Malad";
	
	void empinfo() {
		System.out.println("Non-Static info:- ");
		System.out.println(id);
		System.out.println(salary);
	}
	
	static void cmpinfo() {
		System.out.println("Static info:- ");
		System.out.println(companyname);
		System.out.println(branch);
	}
}




public class Main2 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		
		emp.empinfo();
		Emp.cmpinfo();
	}
}
