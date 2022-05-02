package JAVA_8;

public class Employee {
	
	public String ename;
	public int eno;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String ename, int eno) {
		super();
		this.ename = ename;
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eno=" + eno + "]";
	}
	
	

}
