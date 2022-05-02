package Other_java_concept;

public class P {

	public  void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hi");

	}

}
class C extends P {
	
	public static void main(String[] args)
	{
		C c1=new C();
		c1.m1();;  //Normal method call 
		P p1=new P();
		p1.m1();;  //normal method call
		
		P p2=new C();
		p2.m1(); //in case of static method(m1()),parent class method hides child class method m1()
		//Incase of insance methid child class method override parent class method 

	}

	public  void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello2");

	}

}

class T  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		
		
	}

}
