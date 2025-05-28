package array_list;

import java.util.List;

public interface Operations {
	void insertData(List<EmpPojo> list);

	void updateData(int id, String name);

	void deleteData(int id);

	void search(int id);

	void showData();
}
