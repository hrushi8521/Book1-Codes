package q4;

class Accounts{
	double calSal(int sal) {
		return sal;
	}
	double calSal(int sal, double bonus) {
		return sal + bonus;
	}
	double calSal(int sal, double bonus, double tax) {
		return sal + bonus + tax;
	}
}

class Emp extends Accounts{
	 
	@Override
	double calSal(int sal) {
		return super.calSal(sal);
	}
}

public class Main4 {
	public static void main(String[] args) {
		Accounts accounts = new Accounts();
		Emp emp = new Emp();
		
		System.out.println(accounts.calSal(10));;
		System.out.println(emp.calSal(20));;
	
		System.out.println();
	
	}
}

