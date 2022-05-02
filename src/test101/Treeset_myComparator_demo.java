package test101;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_myComparator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tree_set = new TreeSet<>(new MyComparator1());
		tree_set.add(10);
		tree_set.add(20);
		tree_set.add(5);
		tree_set.add(80);

		System.out.println(tree_set);

		TreeSet<String> tree_set2 = new TreeSet<>(new MyComparator2());
		tree_set2.add("z");
		tree_set2.add("b");
		tree_set2.add("a");
		tree_set2.add("c");
		
		System.out.println(tree_set2);
		
		/*By default string class implemets Comparab;e interface where it has override the Compareto() method 
		Employee is a nuknown user defined class for the JVM >treeset by default use DNSO using Comparableinterface by implemnting it 
		Hence it is unale to find comparable interaface implemented by Employeeclass iEmploee does not implment it 
		
		*/
		Employee e1=new Employee(100, "Akhilesh");
		Employee e2=new Employee(200, "Akhilesh2");
		
		//System.out.println(e1.toString());
	//	e1.hashCode();
		          
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		TreeSet<Employee> tree_set3 = new TreeSet<>();
		tree_set3.add(e1);
		tree_set3.add(e2);
		System.out.println(tree_set3);
		
		Iterator<Employee> itrEmployee=tree_set3.iterator();
		while(itrEmployee.hasNext())
		{
			Employee emp=itrEmployee.next();
			System.out.println(emp.getId() +" "+emp.getName());
			
		}

	}

}

class MyComparator1 implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;

		if (I1 > I2)
			return -1;

		else if (I1 < I2)
			return +1;

		else
			return 0;

	}
}

	class MyComparator2 implements Comparator {
		@Override
		public int compare(Object obj1, Object obj2) {
			// TODO Auto-generated method stub
			String s1 = (String) obj1;
			String s2 = (String) obj2;
			
				return s2.compareTo(s1);

		}

	}

