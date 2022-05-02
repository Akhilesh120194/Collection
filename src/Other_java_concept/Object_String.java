package Other_java_concept;

public class Object_String {
	
	public static void main(String[] args)
	{
		X x=new X();
		x.m("Akhil");
	}

}

class X
{
		public void m(String s)
		{
			System.out.println("Hi");
		}
		
		public void m(Object o)
		{
			System.out.println("Hello");
		}
	
}
