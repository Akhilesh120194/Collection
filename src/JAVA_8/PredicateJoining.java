package JAVA_8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		int[] x = { 10, 20, 30, 45, 55 };

		// print name start with letter 'K'
		String[] names = { "Sunny", "Bunny", "Kajal" };

		Predicate<String> starts_with_K = s -> s.charAt(0) == 'K';

		m2(starts_with_K, names);

		// print name with null and blank
		String[] names2 = { "Sunny", "Bunny", "Kajal", "", null };

		Predicate<String> nameNotEqualToNull = s -> s != null && s.length() != 0;

		m3(nameNotEqualToNull, names2);

		Predicate<Integer> p1 = i1 -> i1 > 10;

		Predicate<Integer> p2 = i1 -> i1 % 2 == 0;

		System.out.println("the numbers greater then 10 are ");
		m1(p1, x);

		System.out.println("the numbers smaller than or equal to 10 are ");
		m1(p1.negate(), x);

		System.out.println("the numbers greater than 10 and are even ");
		m1(p1.and(p2), x);

		System.out.println("the numbers greater than 10 or are even ");
		m1(p1.or(p2), x);
	}

	public static void m3(Predicate<String> nameNotEqualToNull, String[] names2) {
			ArrayList<String> al=new ArrayList<>();
		for(String name :names2)
		{
			if(nameNotEqualToNull.test(name))
				al.add(name);
		}
		
		System.out.println(al);
	}

	public static void m1(Predicate<Integer> p, int[] x) {

		for (int x1 : x) {
			if (p.test(x1))
				System.out.println(x1);
		}
	}

	public static void m2(Predicate<String> p, String[] s) {

		for (String s1 : s) {
			if (p.test(s1))
				System.out.println(s1);
		}
	}

}
