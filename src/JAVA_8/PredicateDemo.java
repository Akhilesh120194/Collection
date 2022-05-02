package JAVA_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/*
 * Predicate is a predefined functional interface defined i=under java.util.function package.
 * It contains a boolean valued function whose return type is always boolean 
 */

public class PredicateDemo {
	

	public static void main(String[] args) {
		
		Predicate<Integer> p1 =I1->I1>10;
System.out.println(p1.test(100));
System.out.println(p1.test(2)); 

Predicate<String> p2 =s1->s1.length()>5;

System.out.println(p2.test("abc"));
System.out.println(p2.test("Akhilesh"));

Predicate<Collection> p3=c->c.isEmpty();

ArrayList<String> al1=new ArrayList<>();
al1.add("A");
al1.add("F");

System.out.println(p3.test(al1));

ArrayList<String> al2=new ArrayList<>();


System.out.println(p3.test(al2));

	}

}
