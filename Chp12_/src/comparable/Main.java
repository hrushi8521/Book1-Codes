package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
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
	public int compareTo(Emp o) {
		return this.id - o.id;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp1 = new Emp(40, "Tom");
		Emp emp2 = new Emp(30, "Larry");
		Emp emp3 = new Emp(10, "Harry");
		Emp emp4 = new Emp(20, "Marie");
		
		List<Emp> emps = new ArrayList<Emp>();
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		Iterator<Emp> iterator = emps.iterator();
		
		System.out.println("Before : ");
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}
		
		Collections.sort(emps);
		System.out.println(" ");
		Iterator<Emp> iterator2 = emps.iterator();
		System.out.println("After : ");
		while (iterator2.hasNext()) {
			Emp emp = (Emp) iterator2.next();
			System.out.println(emp);
		}
		
		System.out.println(" ");
		System.out.println("Sorting using Comparator : ");
		Collections.sort(emps, new IdComparator());
		
		Iterator<Emp> iterator3 = emps.iterator();
		while (iterator3.hasNext()) {
			Emp emp = (Emp) iterator3.next();
			System.out.println(emp);
		}
			
	}
}
