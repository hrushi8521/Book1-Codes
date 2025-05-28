package q5;
class A{
	public A(){
		System.out.println("A");
	}
	void meth1() {
		System.out.println("meth1");
	}
}
class B extends A{
	public B(){
		super();
	}
	
	@Override
	void meth1() {
		super.meth1();
	}
}
public class Main4 {
public static void main(String[] args) {
	B b = new B();
	b.meth1();
}
}
