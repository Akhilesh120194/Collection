package JAVA_8;

public class AnonymousInnerClasss {

	public static void main(String[] args) {
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<=10;i++)
				{
					System.out.println("Child Thread");
				}
				
			}
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main Thread");
		}

	}

}
