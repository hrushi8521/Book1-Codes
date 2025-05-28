package q6;

class Company{
	void details() {
		System.out.println("Company rules are established here");
	}
}

class CompImp extends Company{
	@Override
	void details() {
		System.out.println("Company Implementor works here");
	}
}


class Manager extends CompImp{
	@Override
	void details() {
		System.out.println("Manager works here");
	}
}

class Emp extends CompImp{
	@Override
	void details() {
		System.out.println("Employee works here");
	}
}


public class Main6{

	public static void main(String[] args) {
		Company company = new Company();
		company.details();
		
		CompImp compImp = new CompImp();
		compImp.details();
		
		Manager manager = new Manager();
		manager.details();
		
		Emp emp = new  Emp();
		emp.details();
	}
}