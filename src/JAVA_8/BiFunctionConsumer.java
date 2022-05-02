package JAVA_8;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class EmployeeTest
{
String name;
double salary;

public EmployeeTest(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}



}

public class BiFunctionConsumer {

	public static void main(String[] args) {

		ArrayList<EmployeeTest> al1=new ArrayList<>();
		
		BiFunction<String, Double, EmployeeTest> bf=(name,salary)->new EmployeeTest(name, salary);
		
		al1.add(bf.apply("Akhilesh", 70000.0));
		al1.add(bf.apply("Sachin", 60000.0));
		
		BiConsumer<EmployeeTest, Double> bc=(e,increment)->e.salary=e.salary+increment;

		for(EmployeeTest e:al1)
		{
			bc.accept(e,2000.0);
		}
		
		for(EmployeeTest e:al1)
		{
			System.out.println(e.name+ " " +e.salary);
		}
	}

}
