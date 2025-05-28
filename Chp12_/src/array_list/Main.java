package array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		EmpPojo empPojo1 = new EmpPojo(10, "Tom", "Borivali");
		EmpPojo empPojo2 = new EmpPojo(20, "Jerry", "Malad");
		EmpPojo empPojo3 = new EmpPojo(30, "Harry", "Kandivali");
		EmpPojo empPojo4 = new EmpPojo(40, "Larry", "Bandra");
		EmpPojo empPojo5 = new EmpPojo(50, "Marie", "Vasai");
		
		List<EmpPojo> list = new ArrayList<EmpPojo>();
		
		list.add(empPojo1);
		list.add(empPojo2);
		list.add(empPojo3);
		list.add(empPojo4);
		list.add(empPojo5);
		
		OperationsImp imp = new OperationsImp();
		
		imp.insertData(list);
		imp.showData();
		System.out.println("---------------------------------");
		
		imp.updateData(20, "Jack");
		imp.showData();
		System.out.println("---------------------------------");
		
		imp.deleteData(30);
		imp.showData();
		System.out.println("---------------------------------");
		
		imp.search(40);
		
	}
}
