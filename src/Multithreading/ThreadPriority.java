package Multithreading;

public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {

		// Thread.currentThread().setPriority(8);

		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo3 t2 = new ThreadDemo3();
		// Thread t1=new Thread(t);
	//	t1.setPriority(8);
		// Thread t2=new Thread(t1);
		// System.out.println(t.getPriority()+ " & "+t1.getPriority());
		
		t1.start();
		System.out.println("Ti Thread die ofr alive : "+t1.getThreadGroup());  //Group thran=d name is main 
		t1.join(); //main thread stops until t1 thread die
		
		System.out.println("Ti Thread die ofr alive : "+t1.getThreadGroup()); //T1 thread die 
		
		
	System.out.println("Current Thread "+Thread.currentThread().getName());
		
		t2.start();
	//	Thread.currentThread().join();//after executing thread t2 main thread will get die
		/*
		 * if a thread calls join method on the same thread itself then then program will be stucked 
		 * 
		 */
		//System.out.println(Thread.currentThread().getName());
		System.out.println("Ti Thread die ofr alive : "+t2.getThreadGroup()); //T
    //	t2.join(); ////main thread stops until t2 thread die
    	System.out.println("Ti Thread die ofr alive : "+t2.getThreadGroup()); //T
	;
	//	System.out.println(Thread.currentThread().getName());

		/*
		 * ThreadDemo3 t2=new ThreadDemo3(); t2.setPriority(7); //Thread t2=new
		 * Thread(t1); t2.start(); System.out.println(t2.getPriority());
		 */
	//	Thread.currentThread().start();
		
	
		for (int i = 0; i <= 10; i++) {
			// System.out.println(Thread.currentThread().getName());
			Thread.currentThread().sleep(100);
			System.out.println("Main Thread");

		}

	}}
	


class ThreadDemo2 extends Thread {
	
	

	public void run() {
		
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
			
		}

	}
}

class ThreadDemo3 extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child3 Thread");
		}

	}
}


/*
 * Yield() method causes to pause current execution thread to give the chance
 * for waiting thread of same priority . If there is no waiting thread or all
 * waiting thread have low priority then same thread can continue its
 * execution.
 * 
 * If multiple threads with same priority are waiting then we can't expect which
 * waiting thread will execute .It depends on Thread scheduler .
 * 
 * When a thread wants to wait until completing some other thread then we should
 * go for join(). For ex if thread t1 wants to wait until completes t2 then t1
 * has to call t2.join() .
 */