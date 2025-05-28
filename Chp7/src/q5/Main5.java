package q5;

class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is deleted...");
	}

}

public class Main5 {
	public static void main(String[] args) {
		Emp emp = new Emp(10, "tom");
		emp = null;
		System.gc();
	}
}
