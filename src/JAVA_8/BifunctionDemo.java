package JAVA_8;

import java.util.function.BiFunction;

class Employee_Demo {
	int eno;
	String name;
	double dailywages;

	public Employee_Demo(int eno, String name, double dailywages) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailywages = dailywages;
	}

}

class Timesheet {
	
	int eno;
	int days;
	public Timesheet(int eno, int days) {
		super();
		this.eno = eno;
		this.days = days;
	}
	
	
}

public class BifunctionDemo {

	public static void main(String[] args) {

BiFunction<Employee_Demo, Timesheet, Double> bf=(emp,time)->emp.dailywages*time.days;
Employee_Demo e1=new Employee_Demo(100, "Akhilesh", 2000);
Timesheet t1=new Timesheet(100, 30);

System.out.println("Monthly salary of "+e1.name+" is "+bf.apply(e1, t1));
	}

}
