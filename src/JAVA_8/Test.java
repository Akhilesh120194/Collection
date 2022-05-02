package JAVA_8;

//We can use functional interface to invoke lambda expression 

interface Interf1 {

	public  void m1();

}

interface Interf2 {

	public  int add(int a ,int b);

}

interface Interf3 {

	public  int getLength(String s1);

}

interface Interf4 {

	public  int square(int x);

}


/*class Demo implements Interf1
{

	@Override
	public void m1() {
		
		System.out.println("Hello");
	}
	
}*/

public class Test
{
public static void main(String[] args)
{
//Interf1 i1= new Demo();
//i1.m1();
	//Once we write lambda expression ,functional interface is required to invoke its functionality .
	Interf1 i1=()->System.out.println("Hello");
	i1.m1();
	
	
	Interf2 i2=(a,b)->(a+b);
	System.out.println(i2.add(4, 5));
	
	
	Interf3 i3=(s1)->s1.length();
	System.out.println(i3.getLength("Hello")); 
	
	Interf4 i4=(x)->x*x;
	System.out.println(i4.square(7)) ;
}
}