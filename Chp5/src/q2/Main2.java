package q2;

class Emp {
	Emp salary(int value) {
		System.out.println(value);
		return this;
	}
}

class Manager extends Emp {
	Manager salary(int value, int tax) {
		System.out.println(value - tax);
		return this;

	}
}

public class Main2 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Manager manager = new Manager();
		emp.salary(1000);
		manager.salary(10000, 200);
	}
}
