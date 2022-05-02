package Multithreading;

public class InterruptDemo {
	public static void main(String[] args) throws InterruptedException {
		
		Interrupt t1=new Interrupt();
		t1.start();
		t1.interrupt();
		
		System.out.println("End of main");
		
	}

}

class Interrupt extends Thread {
	//static Thread thread;
	
	public void run() {
		
		try {
			for(int i=0;i<100;i++)
			{
				System.out.println("Child Thread");
			//	Thread.sleep(500);
			}
			System.out.println("I want to sleep");
			try {
				Thread.sleep(200);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("I got interrupted");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	

	}

}

/*
Sleep()-->If a thread does not want to perform any operation for a particular amount of time then we should 
go for a sleep.Overloaded methods are  available .It is  not a final method .It throws IE
Yield()-->If a thread want to pass its execution to give the chance to remaining waiting thread of same priority then we should go for 
yield() method .Overloaded methods are not available .It is not a final method ,It doesn't throw IE.
Join()-->If a thread wants to wait until completion of another thread the we should go for Join().Overloaded methods are
  available. It is a final method .It throws IE
*/