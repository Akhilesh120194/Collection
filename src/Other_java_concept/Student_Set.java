package Other_java_concept;

import java.util.HashSet;
import java.util.Set;

class Student
{
	private int id;
	private String name;
	
	
	
	public Student(int id, String name) {
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
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
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
		Student other = (Student) obj;
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

public class Student_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(2, "Akhil");
		Student s2=new Student(2, "Akhil");
		
		Set<Student> set1=new HashSet<>();
		set1.add(s1);
		set1.add(s2);
		System.out.println(set1);
		

	}

}
