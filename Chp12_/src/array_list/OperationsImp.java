package array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationsImp implements Operations {

	List<EmpPojo> db = new ArrayList<EmpPojo>();

	@Override
	public void insertData(List<EmpPojo> list) {
		db.addAll(list);
		System.out.println("Data Inserted...");
	}

	@Override
	public void updateData(int id, String name) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();

			if (empPojo.getId() == id) {
				empPojo.setName(name);
				System.out.println("Data updated...");
			}
		}

	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
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
		Iterator<EmpPojo> iterator =db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			
			if(empPojo.getId() == id) {
				System.out.println("Found data of id: "+id);
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
