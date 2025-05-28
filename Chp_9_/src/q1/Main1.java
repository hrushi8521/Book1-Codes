package q1;

class A{
	void meth1() {
		
	}
}

class B{
	void meth2() {
		
	}
}

class C{
	void meth3(A a, B b) {
		a.meth1();
		b.meth2();
		
	}
}
public class Main1 {
public static void main(String[] args) {
	C c = new C();
	c.meth3(new A() {
		@Override
		void meth1() {
		System.out.println("tHIS IS A");}
	}, new B() {
		@Override
		void meth2() {
		System.out.println("THIS IS B");}
	});
}
}
