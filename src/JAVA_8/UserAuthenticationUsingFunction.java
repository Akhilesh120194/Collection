package JAVA_8;

import java.util.Scanner;
import java.util.function.Function;

class UserLogin {
	String username;
	String password;

	public UserLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}

public class UserAuthenticationUsingFunction {

	public static void main(String[] args) {

	//	Predicate<User> p = u -> u.username.equalsIgnoreCase("durga") && u.password.equals("java");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		
		String username=sc.next();
		
	System.out.println("Enter Password");
		
		String password=sc.next();
		
		UserLogin user =new UserLogin(username, password);
		
		Function<String,String> f1=s1->s1.substring(0,5);
		Function<String,String> f2=s1->s1.toLowerCase();
		
		
		if(f1.andThen(f2).apply(username).equals("durga") && password.equals("java"))
		{
			System.out.println("Valid user can avail all services");
		}
		else
		{
			System.out.println("Invalid user ,you cannot avail servies");
		}
				
		
		

		

	}

}
