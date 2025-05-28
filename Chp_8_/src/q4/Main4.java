package q4;

class AgeVerifier extends Exception{
	public AgeVerifier(String msg) {
		super(msg);
	}
}

class AgeChecker{
	void check(int age) throws AgeVerifier {
		if(age<18) {
			throw new AgeVerifier("Invalid age");
		}
		else {
			System.out.println("Valid age");
		}
	}
}
public class Main4 {
public static void main(String[] args) {
	AgeChecker ageChecker = new AgeChecker();
	try {
		ageChecker.check(16);
	} catch (AgeVerifier e) {
		System.out.println(e);
	}
}
}

