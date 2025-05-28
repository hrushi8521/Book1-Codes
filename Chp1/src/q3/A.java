package q3;

public class A{
	public int a;
	private int b;
	protected int c;
	int d;
	
	void displayall() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.displayall();
	}
}

class B{
	public static void main(String[] args) {
		A a2 = new A();
		a2.displayall();// Does not work
		System.out.println(a2.a);
//		System.out.println(a2.b); -> Private data cannot be accessed
		System.out.println(a2.c);
		System.out.println(a2.d);
		
	}
}

class C extends A {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a);
//		System.out.println(c.b); -> This does not works since it is private
		System.out.println(c.c);
		System.out.println(c.d);
		
	}
}
