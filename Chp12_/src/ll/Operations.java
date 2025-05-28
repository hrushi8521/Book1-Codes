package ll;

import java.util.LinkedList;

public interface Operations {
	void insertData(LinkedList<EmpPojo> linkedList);

	void updateData(int id, String name);

	void deleteData(int id);

	void search(int id);

	void showData();
}
