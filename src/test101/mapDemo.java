package test101;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Order of element does not require
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "B");
		map1.put(10, "C");
		map1.put(8, "Z");
		map1.put(1, "Q");
		map1.put(4, "P");
		System.out.println("Hashmap Examples:");
		System.out.println(map1);
		map1.put(8, "D");

		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();// It
																	// represent
																	// entry set
		System.out.println("Entry set : " + entrySet);
		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue());
		}

		System.out.println(map1);

		// Order of element require
		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.put(1, "B");
		map2.put(10, "C");
		map2.put(8, "Z");
		map2.put(4, "B");
		System.out.println("Linked_Hashmap Examples:");
		System.out.println(map2);
		map2.put(8, "D");

		System.out.println(map2);

		// Sorting require
		Map<Integer, String> map3 = new TreeMap();
		map3.put(1, "B");
		map3.put(10, "C");

		map3.put(4, "B");
		System.out.println("Map Sorted by Key  Examples:");
		System.out.println(map3.put(8, "Z"));

		System.out.println(map2.put(8, "D"));
		System.out.println(map3);

		System.out.println(map3);

		Map<Employee, String> map4 = new TreeMap<Employee, String>();

		Employee e1 = new Employee(20, "Akhilesh");
		Employee e2 = new Employee(21, "Akhilesh");

		map4.put(e1, "Tomar");
		map4.put(e2, "Tomar");

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		System.out.println(e1);
		System.out.println(e2);

		// e1.setId(999); //-->we can cahange the properties so it is
		// reccommneded not to define setter
		// method and reccommend to define class as final so that no one can
		// extend to it .
		System.out.println("helllo " + map4.get(e1));
		/*
		 * Entry is a interface inside map interface
		 */

		Set<Map.Entry<Employee, String>> emp_entry = map4.entrySet(); //

		for (Map.Entry<Employee, String> entry : emp_entry) {
			Employee emp = entry.getKey();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		Iterator<Map.Entry<Employee, String>> itr = map4.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Employee, String> entry = itr.next();
			Employee emp = entry.getKey();
			System.out.println(emp.getId());

		}

		Set<Employee> keys = map4.keySet();
		for (Employee key : keys) {
			System.out.println(key + " " + map4.get(key));
		}

	}

}
