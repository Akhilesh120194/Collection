package Other_java_concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*In the context of exception handling we can write two type of methods :
 * Common method : It deals with the common requirements which are suitable for al the programmer 
 * eg. parseint() 
 * 
 * Spcific methods alwayus deals with the specific requirements which is generally being used by the end user 
 * eg: public void m1()
 * 
 * if you are creating common methods which is going to be used by the programmer and the common methods is throwing
 *  any kind of exception so being common method developer you need to express those exception using throws keyword.
 *  
 * Suppose if you are specific method developer and your method is going to be used by the end user developer not by the programmer
 * and that method if throwing any exception then being a specific method you need to handle those exception using try catc block
 * .
 * 
 * two types of excption :
 * Compile Time Exception(Checked Exception) : Compile time exception are those exception which can be checked by the compiler 
 * at compile time . 
 * Run Time exception ()Unchecked Exception) :Run time exception are those exception which cannot be checked by the compiler 
 * at compile time . 
 * 
 * None of the xception occur at compile time .All the exception occur at run time .
 * 
 * Whenever there is exception ,the method in which exception occurs will create an objeect and that object will store three things 
 * and main method  pass that object to JVM .After that JVM check tha programmer is handling the exception or not ,if not then pass that 
 * same object to default exception handler :
 * exception(Class name of exception) ,descrition(type of exception),stacktrace(Exception under which method under which line )
 * 
 * Throw :  Throw kkeyword in exception is used to create the custome exception object and that object we pass it o jVM,
 * so basically throw keyword is used for customized exception or user defined exception .
 */

class YoungerAgeException extends RuntimeException {

	public YoungerAgeException(String msg) {
		super(msg);
	}

}

public class Voting_Throw_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();

		try {
			if (age < 16) {
				throw new YoungerAgeException("You are not eligible for voting ");
			//	System.out.println("sjdfkjsfjsf"); we can write any statement after throw 
			}

			else {
				System.out.println("You can vot succesfully");
			}
		} catch (YoungerAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("Hello");
	}

}
