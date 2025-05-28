package q1;
class A{
	static void meth1() {
		System.out.println("This is static method meth1()");
	}
}

public class Main11 {
	
	public static void main(String[] args) {
		A a = new A();
		A.meth1();
	}
}
