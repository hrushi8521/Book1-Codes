package q3;

class RBI {
	double getrateofinterest() {
		return 0.0f;
	}
}

class SBI extends RBI {
	@Override
	double getrateofinterest() {
		return 8.3f;
	}

}

class ICICI extends RBI {
	@Override
	double getrateofinterest() {
		return 9.0f;
	}
}

class AXIS extends RBI {
	@Override
	double getrateofinterest() {
		return 5.5f;
	}
}

public class Main3 {
	public static void main(String[] args) {
		RBI r;
		r = new AXIS();
		System.out.println(r);
		
		r = new ICICI();
		System.out.println(r);
		
		r = new SBI();
		System.out.println(r);
	}
	
}
