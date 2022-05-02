package JAVA_8;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {

		Function<String,String> f1=s->s.toUpperCase();
		Function<String,String> f2=s->s.substring(0, 9);
		
		System.out.println(f1.apply("Aishwaryaabhi"));
		System.out.println(f2.apply("Aishwaryaabhi"));
		
		System.out.println(f1.andThen(f2).apply("Aishwaryaabhi"));//f1 executes first after that f2 will executes .
		System.out.println(f1.compose(f2).apply("Aishwaryaabhi"));//f2 executes first after that f1 will executes .
	
		Function<Integer,Integer> f3=i->i+i;
		Function<Integer,Integer> f4=j->j*j;
		
		System.out.println(f3.andThen(f4).apply(10));
		System.out.println(f3.compose(f4).apply(10));
		
	}

}
