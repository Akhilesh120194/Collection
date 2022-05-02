package Other_java_concept;
///test/src/Other_java_concept/Reflection_Demo.java

import java.lang.reflect.Method;

class Test_Reflection
{
	private void show()
	{
	System.out.println("In Show");	
	}
	
	}

public class Reflection_Demo {

	
	public static void main(String[] args) throws Exception
	{
		Test_Reflection tr1=new Test_Reflection();
		//tr1.show();	 This will not work 
		
		Class c=Class.forName("Other_java_concept.Test_Reflection");
		Test_Reflection tr2=(Test_Reflection)c.newInstance(); //New Instance of class
		Method m1=c.getDeclaredMethod("show",null); //creating object ttof Method to invoke show()
		m1.setAccessible(true); //to make it accessible
		m1.invoke(tr2, null);//Invoking the method show() by passing object of corresponding class
	}
	
}
