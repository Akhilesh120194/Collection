package JAVA_8;

public class AnonymousInnerClasssWithLambda {

	public static void main(String[] args) {
		
		Runnable r1=()->{for(int i=0;i<=10;i++)
		{
			System.out.println("Childddddddd Thread");
		}};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main Thread");
		}

	}

}
