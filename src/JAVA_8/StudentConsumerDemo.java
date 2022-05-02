package JAVA_8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentDetail
{
String name ;
int marks;
public StudentDetail(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + "]";
}



}

public class StudentConsumerDemo {

	public static void main(String[] args) {
		
		ArrayList<StudentDetail> studentDetails=new ArrayList<>();
		populate(studentDetails);
		
		Predicate<StudentDetail> p1=s->s.marks>60;
		Function<StudentDetail,String> f1=s->{
			
			if(s.marks>=90)
			{
				return "A[Distinction]";
			}
			else if (s.marks>=80 && s.marks<90) {
				return "B[Distinction]";
			}
			else if (s.marks>=70 && s.marks<80) {
				return "C[Distinction]";
			}
			return "Try Again";
		};
		
		Consumer<StudentDetail> c=s->{
			System.out.println("Student name "+s.name);
			System.out.println("Student marks "+s.marks);
			System.out.println("Grade "+f1.apply(s));
			System.out.println();
		};
		
		for(StudentDetail student :studentDetails)
		{
			if(p1.test(student))
			{
				c.accept(student);
			}
		}
		
	}
	
	

	private static void populate(ArrayList<StudentDetail> studentDetails) {

		studentDetails.add(new StudentDetail("Akhilesh", 89));
		studentDetails.add(new StudentDetail("Rama", 99));
	}

}
