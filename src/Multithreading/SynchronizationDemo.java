package Multithreading;

/*
 * Synchronization is a modifier applicable only for methods and blocks but not for classes and variables . .
 * If multiple threads are trying o operate on same object then there may be data inconsistency problem.
 * To overcome this problem Synchronized keyword can be used.
 * If a method or block declared as synchronized then at a time only one thread is allowed to execute that method 
 * or block on the given object so that data inconsistency problem will be resolved .
 * 
 *  Internally sync concept is implemented by using lock .Every object in java has a unique lock.Whenever we are using 
 *  synchronization keyword then only lock concept coming to the picture .
 * 
 *  If a thread wants to execute  synchronized method on given object first it has to get lock of that object .
 *  once thread got lock then it is allowed to execute any synchronized method on that object .Once method 
 *  execution completes automatically thread releases lock.
 *  
 *  Acquiring and releasing lock internally takes care by JVM and programmer not responsible for this activity .
 *  Once synchronization method completes ,automatically thread releases lock
 *  
 *  While a thread executing synchronized method on a given object the remaining thread are not allowed to execute 	
 *  any synchronized method on the same object but remaining thread are allowed to execute non synchronized method 
 *  simulataneously
 *  
 *  
 *  Wherever we are performing update operation (Add/remove/update/delete) i.e where state of object is changing 
 *  that area should be under synchronized .
 *  
 *  Wherever we are performing retrieve operation (Read) i.e where state of object won't be changed 
 *  that area should be under non-synchronized .
 *  
 *  Class level lock : if there are two  methods in class and one of method is declared as static synchronized and if there are two thread t1 and t2 . 
To execute static synchronized method thread t1 has to acquire class level lock while t1 has acquired class level lock no other thread is allowed to 
Execute on any method .

Object level lock :if there are two  methods in class and one of method is declared as synchronized and if there are two thread t1 and t2 . 
To execute synchronized method ,thread t1 has to acquire object level lock while t1 has acquired object level lock  other thread is allowed to 
execute  any other method .
 *  
 *  If a thread wants to execute static synchronized method then thread requires class level lock
 *  
 *  While thread executing static synchronized method the remaining thread not allowed to execute any static 
 *  synchronized method of that class simultaneously but remaining thread are allowed to execute following 
 *  method simultaneously
 *  -normal static method
 *  -sync instance method
 *  -normal instance method
 *  
 *  
 *  
 *  If very few lines of code require synchronization then it is not recommended to declare entire method as
 *   synchronized
 *  we have to enclose those few lines of code by using synchronized block .
 *  The man advantage of sync block over sync method is --
 *  It reduce waiting time of thread and increase performance .
 *  
 *  In case of synchronized block lock concept s applicable for object type and class type .
 *  It is not applicable for primitive data type .
 *  
 *  race Condition :If multiple thread operating on same java object simultaneously and causing data 
 *  inconsistency problem is nothing but race condition
 *  
 *  Object Lock :Whenever thread wants to execute instance synchronized method then it require Object lock .
 *  Class level lock :Whenever thread wants to execute static synchronized method then it require class level lock .
 *  
 *  The statement present in sync block and sync method are called as sync statement.
 *  
 *  Two thread can communicate with each other by using wait()notify() and notifyALl() method .
 *  The thread which is expecting updation calls wait()  method while thread which is responsible to perform 
 *  updation call notify()  then  waiting thread gets notification and continue its execution with those updated items .
 *  
 *  
 *  Wait(),notify(),notifyAll() method present in object class not in thread class .Why?
 *  --> Wait(),notify(),notifyAll() method present in object class but not in thread class so that 
 *  thread can call these methods on any java object .
 *  
 *  To call  Wait(),notify(),notifyAll() methods on any object ,thread should be the owner of that object i.e thread should has 
 *  lock of that object i.e thread should be inside the synchronized area.hence we can call   Wait(),notify(),notifyAll() methods
 *  only from synchronized area otherwise we will get run time exception saying :IllegalMonitorStateException.
 *  
 *   If a thread calls wait() method on any object it immediately releases the lock of that particular object 
 *   and enter in to waiting state .
 *   If a thread calls notify() method on any object it releases the lock of that particular object but may not 
 *    immediately.
 *    Except wait(), notify(),notifyAll() there is no other method where thread releases lock.
 *    
 * 
 *    sleep(): As the name suggests, it is a static method that pauses or stops the execution of the current thread for some specified period
 *    
 *    notify(): It sends a notification and wakes up only a single thread instead of multiple threads that are waiting on the object’s monitor.
 *    notifyAll(): It sends notifications and wakes up all threads and allows them to compete for the object's monitor instead of a single thread. 

12. What is the start() and run() method of Thread class? 
When the start() method is called, a new thread is created and this newly created thread executes the
task that is kept in the run() method. One can call the start() method only once.  

Yield() method causes to pause current execution thread to give the chance
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
 * 
 * Deadlock Situation : There are two threads ,thread t1 requires resource that are acquired by thread t2 and t2 requires resource
 *  that are acquired by t1

 */

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Display d1 = new Display();
		MythreadSync mt2 = new MythreadSync(d1, "Yuvraj");
		MythreadSync mt1 = new MythreadSync(d1, "Dhoni");
		
	
		
	/*	Display d2 = new Display();
		MythreadSync mt3 = new MythreadSync(d2, "raina");
		Display d3 = new Display();
		MythreadSync mt4 = new MythreadSync(d3, "Scahin");
		*/
		mt2.start();
		mt1.start();
		
		//mt3.start();
		//mt4.start();
		
	}

}

class Display {
	public static synchronized void wish(String name) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Good Morning " + name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class MythreadSync extends Thread {
	Display d;
	String name;

	MythreadSync(Display d, String name) {
		// TODO Auto-generated constructor stub
		this.d = d;
		this.name = name;
	}

	public void run() {
		System.out.println("ksdcks ckjs ");
		d.wish(name);
	}

}