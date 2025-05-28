package q5;

class Outter{
	private int a= 10; 
	class Inner{
		void display() {
			System.out.println(a);
		}
	}
}
public class Main5 {
public static void main(String[] args) {
	Outter outter = new Outter();
	Outter.Inner inner = outter.new Inner();
	inner.display();
}
}
