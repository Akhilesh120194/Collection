package test101;

import java.util.HashSet;

/*
 * Contract between hashcode() and equals() :  
 * If equals() method is being overriden then hascode() method must get overridden  for accurate result  result 
 */

public class EqualsContractDemo {

	public static void main(String[] args) {
		
		Employees emp1=new Employees(1, "Akhilesh");
		Employees emp2=new Employees(1, "Akhilesh");
		
		System.out.println(emp1.equals(emp2));  //false as both are different object .
		
	HashSet<Employees> empset=new HashSet<>();
	empset.add(emp1);
	empset.add(emp2);
	
	System.out.println(empset);

	}

}


class Employees
{
	private int id;
	private String name ;
	
	
	
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	}
	
	
	
	
	
