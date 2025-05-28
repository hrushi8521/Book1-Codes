package q4;

import java.util.Objects;

class Emp {
	int id;
	String name;

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

public class Main4 {
	public static void main(String[] args) {
		Emp emp = new Emp(10, "tom");
		Emp emp2 = new Emp(10, "tom");

		System.out.println(emp.equals(emp2));
	}
}
