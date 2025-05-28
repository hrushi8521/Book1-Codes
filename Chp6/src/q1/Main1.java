package q1;

class A implements Policy {

	@Override
	public void workhrs() {
		System.out.println("Complete 200 hrs.");
	}
}

class B extends Company {

	@Override
	double salary() {
		return 10;
	}

	@Override
	void work() {
		System.out.println("Complete work assigned.");

	}

}

public class Main1 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.workhrs();
		b.work();

	}
}
