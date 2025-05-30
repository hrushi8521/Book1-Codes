package comparable;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.id < o2.id) {
			return -1;
		}else if(o1.id > o2.id) {
			return 1;
		}
		
		return 0;
	}

}
