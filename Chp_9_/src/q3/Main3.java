package q3;
class Outter{
	final int a = 10;
	void meth1() {
		
		class Inner{
			void display() {
				System.out.println(a);
			}
		}
		
		Inner inner = new Inner();
		inner.display();
	}
}
public class Main3 {
public static void main(String[] args) {
	Outter outter = new Outter();
	outter.meth1();
}
}
