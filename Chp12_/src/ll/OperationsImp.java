package ll;

import java.util.Iterator;
import java.util.LinkedList;

public class OperationsImp implements Operations {

	LinkedList<EmpPojo> db = new LinkedList<EmpPojo>();

	@Override
	public void insertData(LinkedList<EmpPojo> linkedList) {
		db.addAll(linkedList);
		System.out.println("Data Inserted...");
	}

	@Override
	public void updateData(int id, String name) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				empPojo.setName(name);
				System.out.println("Data Updated");
			}
		}
	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				iterator.remove();
				System.out.println("Data Deleted");
			}
		}
	}

	@Override
	public void search(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				System.out.println("Found entry with id: " + id);
				System.out.println(empPojo);
			}
		}
	}

	@Override
	public void showData() {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
		}
	}

}
