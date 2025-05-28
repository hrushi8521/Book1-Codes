package maps;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Prop {
	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.put("India", "New Delhi");
		properties.put("China","Beijing");
		properties.put("Indiana", "IndianaPolis");
		
		Set set = properties.keySet();
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string+" "+ properties.getProperty(string));
		}
		System.out.println(" ");
		String string2 = properties.getProperty("US", "Not found");
		System.out.println(string2);
	}
}
