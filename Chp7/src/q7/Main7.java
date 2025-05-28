package q7;

import java.lang.reflect.Method;

class Emp {
	int id;
	String name;

	public void meth1() {
		id = 10;

	}

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

public class Main7 {
	public static void main(String[] args) {
		Emp emp = new Emp(10, "tom");
		Method method[] = emp.getClass().getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}
	}
}
