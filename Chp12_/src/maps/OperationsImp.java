package maps;

import java.util.HashMap;
import java.util.Map;

public class OperationsImp implements Operations {
	
	Map<Integer, String> db = new HashMap<Integer, String>();
	
	@Override
	public void insertData(Map<Integer, String> map) {
		db.putAll(map);
		
	}

	@Override
	public void updateData(int id, String name) {
		
		
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showData() {
		db.forEach((key,value)->System.out.println(key+" "+value));
		
	}


	
}
