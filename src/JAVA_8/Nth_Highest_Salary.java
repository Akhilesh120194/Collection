package JAVA_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Nth_Highest_Salary {

	public static void main(String[] args) {
		List<Employee_Model> list = new ArrayList();

		list.add(new Employee_Model("Ram", "X", 10000, "Morena"));
		list.add(new Employee_Model("Shyam", "Y", 20000, "Morena"));
		list.add(new Employee_Model("Ramesh", "Y", 30000, "Morena"));

		Optional<Double> salary = list.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();

		System.out.println(salary);
		
		Optional<Employee_Model> min_salary = list.stream().min(Comparator.reverseOrder());

		System.out.println(salary);


		list.stream().sorted((i1,i2)->i1.compareTo(i2)).map(e->e.getSalary()).forEach(s->System.out.println(s));
				
	}
}
