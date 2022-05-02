package Other_java_concept;

public class ObjectString {
	
	public void test1(String s1)
	{
		System.out.println("Hi");
	}
	
	public void test1(Object o1)
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectString os=new ObjectString();
		os.test1("Hello");
	}

}
