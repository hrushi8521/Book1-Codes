package q5;

class Empinfo{
	String branch = "Malad"; //global
	static String compname = "SDAC"; //static
	
	void personalinfo() {
		int id = 201; // local
		String name = "tom";
		System.out.println(id);
		System.out.println(name);
	}
}

public class Main5 {
	public static void main(String[] args) {
		Empinfo empinfo = new Empinfo();
		empinfo.personalinfo();
		System.out.println(Empinfo.compname);
		System.out.println(empinfo.branch);
	}
}
