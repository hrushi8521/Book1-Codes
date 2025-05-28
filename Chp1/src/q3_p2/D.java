package q3_p2;

import q3.*;

// Child class of A
public class D extends A{
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.a);
//		System.out.println(d.b); -> private
		System.out.println(d.c);
//		System.out.println(d.d); -> default
		
		
	}
}

class E{
	public static void main(String[] args) {
		A a3 = new A();
		System.out.println(a3.a);
//		System.out.println(a3.b); -> private
//		System.out.println(a3.c); -> protected
//		System.out.println(a3.d); -> default
	}
}