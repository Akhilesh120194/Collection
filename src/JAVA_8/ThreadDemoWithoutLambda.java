package JAVA_8;

class MyRunnable implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<=10;i++)
		{
			System.out.println("Child thread");
		}
		
	}
}

public class ThreadDemoWithoutLambda {

	public static void main(String[] args) {
		
		Runnable r1=new MyRunnable() ;
		
		Thread t=new Thread(r1);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread");
		}
			
		

	}

}

