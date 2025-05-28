package maps;

import java.util.Map;

public interface Operations {
	void insertData(Map<Integer, String> map);

	void updateData(int id, String name);

	void deleteData(int id);

	void search(int id);

	void showData();
}
