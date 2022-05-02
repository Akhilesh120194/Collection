package JAVA_8;

public class Employee_Model implements Comparable<Employee_Model> {

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	String name;
	String designation;
	double salary ;
	String city ;

	public Employee_Model(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee_Model [name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}

	@Override
	public int compareTo(Employee_Model o) {
		// TODO Auto-generated method stub
		if(this.getSalary()>o.getSalary())
			return -1;
		else if (this.getSalary()>o.getSalary()) {
			return +1;
		}
		return 0;
	}
	
	
	
	

}
