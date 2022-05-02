package Multithreading;



public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MainThreadExecutionFirst.thread=Thread.currentThread();   //
		MainThreadExecutionFirst mt1 = new MainThreadExecutionFirst();
		mt1.start();
		/*
		 * if below commented method uncommented then both main and child thread wait for each other forever .
		 * .that will be a deadlocksituTION..
		 * 
		 * 
		 * A thread can interrupt a sleeping thread or waiting thread by using interupt method of thrad class
		 * public void interrupt();
		 * 
		 */
	//	mt1.join();
		
		for (int i = 0; i < 10; i++) {
			Thread.currentThread().sleep(800);
			System.out.println("main Thread");
		}

	}

}

class MainThreadExecutionFirst extends Thread {
	static Thread thread;
	
	public void run() {
		System.out.println(thread.getName());  //,main thrad
		System.out.println(currentThread().getName());  //Child Thread
		try {
			thread.join();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}

	}

}