package ll;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		EmpPojo empPojo1 = new EmpPojo(10, "Tom", "Malad");
		EmpPojo empPojo2 = new EmpPojo(20, "Harry", "Kandivali");
		EmpPojo empPojo3 = new EmpPojo(30, "Larry", "Borivali");
		EmpPojo empPojo4 = new EmpPojo(40, "Marry", "Bandra");
		EmpPojo empPojo5 = new EmpPojo(50, "Jake", "Vasai");
		
		LinkedList<EmpPojo> linkedList = new LinkedList<EmpPojo>();
		
		linkedList.add(empPojo1);
		linkedList.add(empPojo2);
		linkedList.add(empPojo3);
		linkedList.add(empPojo4);
		linkedList.add(empPojo5);
		
		OperationsImp imp = new OperationsImp();
		
		imp.insertData(linkedList);
		imp.showData();
		System.out.println("----------------------------------");
		
		imp.updateData(20, "Karl");
		imp.showData();
		System.out.println("----------------------------------");
		
		imp.deleteData(40);
		imp.showData();
		System.out.println("----------------------------------");
		
		imp.search(30);
		
		
	}
}
