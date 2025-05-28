package q2;

interface A{
	void meth1(String s1);
}

abstract class B{
	abstract void meth2(String s2);
}

class C{
	void meth3(String s3) {
		
	}
}
public class Main2 {
public static void main(String[] args) {
	A a = new A() {
		
		@Override
		public void meth1(String s1) {
			System.out.println(s1);
		}
	};
	a.meth1("Interface");
	
	B b = new B() {
		
		@Override
		void meth2(String s2) {
		System.out.println(s2);}
		
	};
	b.meth2("Abstract class");
	
	C c = new C() {
		@Override
		void meth3(String s3) {
			System.out.println(s3);
}
		
	};
	c.meth3("Simple class");
	
}
}
