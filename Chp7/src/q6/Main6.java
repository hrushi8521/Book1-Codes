package q6;

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
}

public class Main6 {
	public static void main(String[] args) {
		Emp emp = new Emp(10, "tom");
		System.out.println(emp);
	}
}
