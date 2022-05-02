package JAVA_8;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	String username;
	String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}

public class UserAuthenticationUsingPredicate {

	public static void main(String[] args) {

		Predicate<User> p = u -> u.username.equalsIgnoreCase("durga") && u.password.equals("java");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		
		String username=sc.next();
		
	System.out.println("Enter Password");
		
		String password=sc.next();
		
		User user =new User(username, password);
		
		if(p.test(user))
		{
			System.out.println("Valid user can avail all services");
		}
		else
		{
			System.out.println("Invalid user ,you cannot avail servies");
		}
				
		
		

		

	}

}
