package q4;

import q4.Outter.Inner;

class Outter{
	private static int a = 10;
	static class Inner{
		static void display() {
			System.out.println(a);
		}
	}
}
public class Main4 {
public static void main(String[] args) {
	Outter.Inner inner = new Outter.Inner();
	Inner.display();
	
}
}
