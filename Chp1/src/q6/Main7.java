package q6;


class Accounts{
	double sal;

	public Accounts(double sal) {
		super();
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Accounts [sal=" + sal + "]";
	}
	
	
}

class Details{
	String branch;

	public Details(String branch) {
		super();
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Details [branch=" + branch + "]";
	}
	
}

class Emp{
	String name;
	int id;
	Accounts accounts;
	Details details;
	
	public Emp(String name, int id, Accounts accounts, Details details) {
		super();
		this.name = name;
		this.id = id;
		this.accounts = accounts;
		this.details = details;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", accounts=" + accounts + ", details=" + details + "]";
	}
	
	
}

public class Main7 {
	public static void main(String[] args) {
		Accounts accounts = new Accounts(300);
		Details details = new Details("Malad");
		Emp emp = new Emp("Hrushikesh", 210, accounts, details);
		System.out.println(emp);
	}
}
