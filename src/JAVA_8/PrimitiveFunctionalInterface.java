package JAVA_8;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * In normal functional interface due to repetitive autoboxing and autounxing performace gone down so to 
 * improve the performance primitive functional interface came in to the picture .
 * 
 * Only 3 types of primitive Predicate functional interface :
 * 1.IntPredicate
 * 2.LongPredicate
 * 3.DoublePredicate
 * 
 */

public class PrimitiveFunctionalInterface {

	public static void main(String[] args) {

		int[] x = { 10, 15, 21, 30, 46 };

		IntPredicate p = i -> i % 2 == 0;

		for (int temp : x) {
			if (p.test(temp))
				System.out.println(temp);
		}

		// String s1="Akhilesh";

		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println(f1.apply(5)); // multiple conversion at the time of
											// input as well as during return
											// requires .
		
		System.out.println("**************************************");

		IntFunction<Integer> f2 = i -> i * i; //Int signifies int as input
		System.out.println(f1.apply(5)); // No autoboxing require at the time of
											// input .Autoboxing occur during
											// return type

		ToIntFunction<String> f3 = s -> s.length(); //ToInt signifies int as return type 

		System.out.println(f3.applyAsInt("Akhilesh"));

		System.out.println("*********************************");

		Function<Integer, Double> f4 = i -> Math.sqrt(i);
		System.out.println(f4.apply(4));

		IntToDoubleFunction f5 = i -> Math.sqrt(i); //IntToDouble signifies int as inpur and doubleas return type 
		System.out.println(f5.applyAsDouble(4));

		System.out.println("*********************************");
		
		

	}

}
