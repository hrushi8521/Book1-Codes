package vector;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		EmpPojo empPojo1 = new EmpPojo(10, "Tom", "Malad");
		EmpPojo empPojo2 = new EmpPojo(20, "Harry", "Kandivali");
		EmpPojo empPojo3 = new EmpPojo(30, "Jerry", "Borivali");
		EmpPojo empPojo4 = new EmpPojo(40, "Larry", "Vasai");
		EmpPojo empPojo5 = new EmpPojo(50, "Karl", "Bandra");
		
		Vector<EmpPojo> vector = new Vector<EmpPojo>();
		
		vector.add(empPojo1);
		vector.add(empPojo2);
		vector.add(empPojo3);
		vector.add(empPojo4);
		vector.add(empPojo5);
		
		OperationsImp imp = new OperationsImp();
		
		imp.insertData(vector);
		imp.showData();
		System.out.println("---------------------------");
		
		imp.updateData(20, "Marie");
		imp.showData();
		System.out.println("---------------------------");
		
		imp.deletedData(30);
		imp.showData();
		System.out.println("---------------------------");
		
		imp.search(40);

	}
}
