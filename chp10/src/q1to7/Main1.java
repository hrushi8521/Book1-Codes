package q1to7;

public class Main1 {
	public static void main(String[] args) {
		// length()
		String s1 = "Hrushikesh";
		System.out.println(s1.length());
		
		//compareTo()
		String s2 = "Pournima";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s1));
		System.out.println(s2.compareTo(s1));
		
		//concat()
		String s3 = "Omkar";
		System.out.println(s1.concat(s3));
		
		//trim()
		String s4 = "   Remove Space   ";
		System.out.println(s4.trim());
		
		//replace()
		String s5 = "Wello world";
		System.out.println(s5.replace('W','h'));
		
		// valueOf()
		int a = 10;
		String s6 = String.valueOf(a);
		System.out.println(a + 10);
		System.out.println(s6 + 10);
		
		//Wrapper class
		int b = 111;
		Integer i = new Integer(b);
		int t =i.intValue();
		
		System.out.println(t);
		
		
	}
}
