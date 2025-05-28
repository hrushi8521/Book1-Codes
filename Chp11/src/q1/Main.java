package q1;

import java.lang.reflect.Method;

class Emp{
	int id;
	String name;
	
	void workAssigned(String post) {
		System.out.println(post);
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

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(10, "Tom");
		emp.workAssigned("Manager");
		
		Method method[] = emp.getClass().getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}
	}
}
