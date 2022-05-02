package JAVA_8;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> f=s->s.length();
		
		System.out.println(f.apply("Akhilesh"));
		
		Function<Integer, Integer> fsq=i->i*i;
		
		System.out.println(fsq.apply(4));
		
Function<String, String> f_remove_space=s->s.replace(" ", "");
		
		System.out.println(f_remove_space.apply("Welcome to the JAVA 8 Worl d"));
		
		Function<String, Integer> f_space_Count=s->s.length()-s.replace(" ", "").length();	
		
		System.out.println(f_space_Count.apply("Welcome to the JAVA 8 Worl d"));
		
	}

}
