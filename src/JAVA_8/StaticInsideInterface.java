package JAVA_8;

/*
 * main purpose of defining statci method in JAVA 8 is to define general utility methods .
 * 
 */

interface inter_demo
{

	public static void m1()
	{
		System.out.println("Interface static method");
	}
	
	
	
}

public class StaticInsideInterface {

	public static void main(String[] args) {
		
		//StaticInsideInterface.m1();  //By default static method inside interface get inherited to implemented class 
 //m1();
		inter_demo.m1();
	}

}
