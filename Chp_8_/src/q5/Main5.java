package q5;

public class Main5 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello World");
		try {
			int v = 10 / 0;
			int a[] = new int[10];
			a[20] = 20;

		} catch (ArithmeticException a) {
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Hello World");
		System.out.println("Hello World");

	}
}
