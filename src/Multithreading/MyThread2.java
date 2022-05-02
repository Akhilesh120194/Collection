package Multithreading;

public class MyThread2 {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);

		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

}

class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}

	}
}

/*
Every thread in java has some priority.It may be default priority generated by JVM or customized 
priority provided by programmer.Valif range of thread priority is 1 to 10  where  is 
1 is min priority and 10 max priority ,Thread class defined following constant to represent 
some standard priority :
1.Thread.MIN_PRIORITY  -->1
2.Thread.MAX_PRIORITY   -->10
3.Thread.NORM_PRIORITY  

Thread Scheduler uses thread priority for allocating processor.
The default priority of main  thread is always 5 but for all other thread it inherits from parent to child 
*/