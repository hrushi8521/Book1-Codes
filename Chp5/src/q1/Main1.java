package q1;

final class Emp{
	final int id = 10;
	final void showId() {
		
		System.out.println(id);
	}
}

//class B extends A{
//	 void meth1() {
//		// TODO Auto-generated method stub
//
//	}
//}
public class Main1 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.showId();
	}
}
