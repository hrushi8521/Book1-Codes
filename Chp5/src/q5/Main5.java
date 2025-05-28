package q5;

class Company {
	String company_name = "SDAC";

	void services() {
		System.out.println("Teaching.");
	}
}

class Emp extends Company {

	void showDetails() {
		System.out.println(super.company_name);
	}

	void editDetails() {
		super.company_name = "SHELL";
		System.out.println("The new company name is : " + company_name);
	}

	@Override
	void services() {
		super.services();
	}

}

public class Main5 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.showDetails();
		emp.editDetails();
		emp.services();
	}
}
