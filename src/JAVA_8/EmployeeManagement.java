package JAVA_8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeManagement {

	public static void main(String[] args) {

		ArrayList<Employee_Model> empList = new ArrayList<>();
		empList.add(new Employee_Model("Akhilesh", "Lead", 150000, "Noida"));
		empList.add(new Employee_Model("Shivam", "TA", 100000, "Pune"));
		empList.add(new Employee_Model("raju", "manager", 200000, "Bangalore"));
		empList.add(new Employee_Model("DK", "Lead", 150000, "Noida"));

		Employee_Model CEO = new Employee_Model("Narayan", "CEO", 9000000, "Chennai");

		System.out.println(empList);

		System.out.println("Employee with the designation Lead");
		Predicate<Employee_Model> p1 = e -> e.designation.equalsIgnoreCase("lead");

		display(p1, empList);

		System.out.println("Employee with the city noida");
		Predicate<Employee_Model> p2 = e -> e.city.equalsIgnoreCase("noida");

		display(p2, empList);

		System.out.println("Employee with the city Noida and designation Lead");
		// Predicate<Employee_Model> p3=e->e.city.equalsIgnoreCase("noida") &&
		// e.designation.equalsIgnoreCase("lead");

		display(p1.and(p2), empList);

		Predicate<Employee_Model> isCEO = Predicate.isEqual(CEO);
		// System.out.println(isCEO.test());

		//Logic to calculate total salary 
		Function<ArrayList<Employee_Model>, Double> f_total_salary = e -> {
			double total = 0;
			for (Employee_Model emp : e) {
				total = total + emp.salary;
			}
			return total;
		};

		System.out.println(f_total_salary.apply(empList));
		
		//Logic for salary increment
		Predicate<Employee_Model> pSalInc = e1 -> e1.salary <= 100000;

		Function<Employee_Model, Employee_Model> fSalInc = e1 -> {
			e1.salary = e1.salary + 30000;
			return e1;
		};

		ArrayList<Employee_Model> empList2 = new ArrayList<>();
		for (Employee_Model emp : empList) {
			if (pSalInc.test(emp)) {
				fSalInc.apply(emp);
				empList2.add(emp);
			}

		}
		
		System.out.println(empList);
		System.out.println(empList2);

	}

	

	public static void display(Predicate<Employee_Model> p1, ArrayList<Employee_Model> empList) {
		for (Employee_Model emp : empList) {
			if (p1.test(emp))
				System.out.println(emp);
		}
	}

}
