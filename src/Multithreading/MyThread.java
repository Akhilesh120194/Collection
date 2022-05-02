package Multithreading;

class ThreadDemo extends Thread {
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread");
		}
		
	}
	
	public void run(int x)
	{
		System.out.println("overloaded method.");
	}

}

public class MyThread
{
	public static void main(String[] args)
	{
		ThreadDemo t1=new ThreadDemo();
		t1.start(); 
	//	t1.run();  //start() psnt in thrad class which internally calls run().If directly t.run() 
		//executed then it executed the run method like a normal method call .and then there will be only one thread that is main thread 
		//In t.start() new thread will be created which is respodnible fr the executio f run();
		
		/*
		 * start()
		 * {
		 * 1.register thread with thread scheduler.
		 * 2.perform other mandatory activities 
		 * 3.invoke run();
		 * }
		 * 
		 * overloading of run method is possit.start() call no arument run() by defualt 
		 * 
		 */
		for(int i=100;i<120;i++)
		{
			System.out.println(i);
		}
	}
}