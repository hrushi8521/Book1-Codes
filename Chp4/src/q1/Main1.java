package q1;

class Hobbies{
	
}

class Address{
	String address;

	public Address(String address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
}

class Emp{
	int id;
	String name;
	Address address;
	Hobbies hobbies;
	public Emp(int id, String name, Address address, Hobbies hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
	
}

public class Main1 {
	public static void main(String[] args) {
		Hobbies hobbies = new Hobbies();
		Address address = new Address("Malad");
		
		Emp emp = new Emp(102, "Tom", address, hobbies);
		
		System.out.println(emp);
	}
}
