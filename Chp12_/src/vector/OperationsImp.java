package vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class OperationsImp implements Operations {
	Vector<EmpPojo> db = new Vector<EmpPojo>();
	@Override
	public void insertData(Vector<EmpPojo> vector) {
		db.addAll(vector);
		System.out.println("Data Inserted...");
	}

	@Override
	public void updateData(int id, String name) {
		Enumeration<EmpPojo> enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if(empPojo.getId() == id) {
				empPojo.setName(name);
				System.out.println("Data Updated...");
			}
		}
	}

	@Override
	public void deletedData(int id) {
		Iterator<EmpPojo> iterator =db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId() == id) {
				iterator.remove();
				System.out.println("Data deleted...");
			}
		}
	}

	@Override
	public void search(int id) {
		Enumeration<EmpPojo> enumeration = db.elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if(empPojo.getId() == id) {
				System.out.println("Found data for id: "+id);
				System.out.println(empPojo);
			}
		}		
	}

	@Override
	public void showData() {
		Iterator<EmpPojo> iterator =db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
		}
	}

}
