package Other_java_concept;
/*for any java class if we are allowed to create only one object such type of classes called singleton class.
 * Ex:Runtime,Busineess delegate,service locator etc.
 * 
 * Advantages of Singleton class :
 * If severeal people have same requirement then it is not recommended to create a separate object for 
 * every reqyuirement .
 * we have to create only one object and we can reuse that same object for every similar requirement so that 
 * perfomance and memory utilization will be improved. This is the central idea osf singleton class
 * 
 * -->we can not create Singleton classes by using constructor or new operator 
 * 
 *  Runtime r1=Runtime.getRuntime();
 * Runtime r2=Runtime.getRuntime();
 * Runtime r3=Runtime.getRuntime();
 * 
 *Here ri r2,r3 share only one runtime object .
 * 
 * How to create our own singleton classes .
 * We can create our own singleton classes for this we have two approcah .
 * creating private constuctor in class and private static variable and public factory method 
 * 
 * Approach 1 ==>Test
 * Approach 2==>Test2
 * 
 * Note :How can we restrict the inheritance of any parent class?
 * Ans : by declaring the every constructor in parent class as private we can restrict inheritance because 
 * every child class has default constructor which calls its parent class constructor using super() ,since parent class constructor declared as 
 * private super() won't be able to call it from outside child class .
 * 
 * 
 * 	
 * 
 * 
 */

class Test {
	
	private static Test st=new Test();
	
	private Test()
	{
		
	}
	
	public static Test getInstance()
	{
		return st;
	}
	
	public void check()
	{
		System.out.println("Hello");
	}
	
	
}

class Test2 {
	
	private static Test2 st=null;
	
	private Test2()
	{
		
	}
	
	
	//If two threads will invoke this method simultaneaously it will create two object so two avoud this we have used Su=ynchronized 
	public static synchronized Test2 getInstance()
	{
		if(st==null)
		{
			st=new Test2();  
		}
		return st;  //first when st is null it is created then after it return the same object 
	}
	
	public void check()
	{
		System.out.println("Hello");
	}
	
	
}

public class Singleton_Class_Demo
{
	

	public static void main(String[] args)
	{
		Test t1=Test.getInstance();
		Test t2=Test.getInstance();
		t1.check();
		System.out.println(t1.equals(t2));
	}

	}
