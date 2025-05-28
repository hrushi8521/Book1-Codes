package vector;

import java.util.Vector;

public interface Operations {
	void insertData(Vector<EmpPojo> vector);

	void updateData(int id, String name);

	void deletedData(int id);

	void search(int id);

	void showData();
}
