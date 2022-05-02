package JAVA_8;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {
		
		ArrayList<Employee> l1=new ArrayList<>();
		l1.add(new Employee("Akhil", 100));
		l1.add(new Employee("Dk", 200));
		l1.add(new Employee("Vibhu", 400));
		l1.add(new Employee("Rama", 300));
		
		Collections.sort(l1,(e1,e2)->(e1.eno>e2.eno)?+1:(e1.eno<e2.eno)?-1:0);
		
		System.out.println(l1);
		

	}

}
