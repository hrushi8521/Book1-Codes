package q2;
class Emp{
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
		System.out.println("The object is deleted...");
	}
	
}
public class Main2 {
	public static void main(String[] args) {
		Emp emp = new Emp(10,"Tom");
		System.out.println(emp);
		
		emp = null;
		System.gc();
		
		
	}
}
