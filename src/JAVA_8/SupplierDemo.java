package JAVA_8;

import java.util.Date;
/*
 * The Supplier functional interface is also a type of functional interface that does not take any
 *  input or argument and yet returns a single output.
 * 
 */
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();

		System.out.println(s.get());

		Supplier<String> s1 = () -> {

			String[] str = { "Sunny", "Bunny", "Munny", "Chunny", "Tunny" };
			int y = (int) (Math.random() * 4); // 0.99*4=0.36==>varies from 0 to
												// 3

			return str[y];

		};
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());

		Supplier<String> s2 = () -> {

			String otp = " ";
			for (int i = 0; i < 6; i++){
				 otp = otp + (int)(Math.random() * 10);
			}
			return otp;
		};
		
		System.out.println(s2.get());
	
		/*
		 * Rules for Password generation :
		 * ->Length should be 8 characters 
		 * ->2,4,6,8 places only digits 
		 * ->1,3,5,7 places only upper case alphabets ,symbol 
		 */
		
		Supplier<String> s3=()->
		{
			String pwd="";
			Supplier<Integer> digit=()->(int)(Math.random()*10);
			
			String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$"  ;//0 TO 28
			
			Supplier<Character> str_symbol=()->str.charAt((int)(Math.random()*10));
			
			for(int i=0;i<8;i++)
			{
				if(i%2==0)
				{
					pwd=pwd+digit.get();
				}
				else
					pwd=pwd+str_symbol.get();
					
			}
			
			return pwd;
			
		};

	System.out.println(s3.get());
	}

}
