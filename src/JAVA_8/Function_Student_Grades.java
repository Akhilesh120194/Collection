package JAVA_8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

}

public class Function_Student_Grades {

	public static void main(String[] args) {
		Student s1 = new Student("Akhilesh", 89);
		Student s2 = new Student("Rama", 90);
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);

		Function<Student, String> stud_grades = s -> {
			if (s.marks >= 90 && s.marks <= 100) {
				return "A[Distinction]";
			} else if (s.marks >= 80 && s.marks < 90) {
				return "B[Distinction]";
			} else if (s.marks >= 70 && s.marks < 80) {
				return "C[Distinction]";
			} else
				return "failed";
		};

		calcGrades(stud_grades, list);

	}

	private static void calcGrades(Function<Student, String> stud_grades, ArrayList<Student> list) {

		Predicate<Student> stud_pred = s -> s.marks>=90;

		for (Student stud : list)

		{
			if (stud_pred.test(stud)) {

				System.out.println(stud_grades.apply(stud));
			}
		}

	}

}
