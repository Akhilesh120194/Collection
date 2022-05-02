package ProdConsum;

import java.util.ArrayList;
import java.util.List;

/*Two thread can communicate with each other by using wait()notify() and notifyALl() method .
 *  The thread which is expecting updation calls wait()  method while thread which is responsible to perform 
 *  updation call notify()  then  waiting thread gets notification and continue its execution with those updated items .
 *  
 *  
 *  Wait(),notify(),notifyAll() method present in object class not in thread class .Why?
 *  --> Wait(),notify(),notifyAll() method present in object class but not in thread class so that 
 *  thread can call these methods on any java object .
 *  
 *  To call  Wait(),notify(),notifyAll() methods on any object ,thread should be the owner of that object i.e 
 *  thread should has 
 *  lock of that object i.e thread should be inside the synchronized area.hence we can call   Wait(),notify(),notifyAll() methods
 *  only from synchronized area otherwise we will get run time exception saying :IllegalMonitorStateException.
 *  
 *   If a thread calls wait() method on any object it immediately releases the lock of that particular object 
 *   and enter in to waiting state .
 *   If a thread calls notify() method on any object it releases the lock of that particular object but may not 
 *    immediately.
 *    Except wait(), notify(),notifyAll() there is no other method where thread releases lock.
 */
public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sharedList = new ArrayList<Integer>();

		Thread t1 = new Thread(new Producer(sharedList));
		Thread t2 = new Thread(new Consumer(sharedList));
		t1.start();
		t2.start();
	}

}

class Producer implements Runnable {
	List<Integer> sharedList = null;
	final int MAX_SIZE = 5;
	int i = 0;

	public Producer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	@Override
	public void run() {

		while (true) {
			try {
				produce(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			i++;
		}

	}

	public void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.size() == MAX_SIZE) {
				System.out.println("Share list is ful ,waiting for the consumer to consume ");
				sharedList.wait();
			}

		}
		synchronized (sharedList) {
			System.out.println("Produce Element " + i);
			sharedList.add(i);
			Thread.sleep(1000);
			sharedList.notifyAll(); // if consumer is waiting for producer to
									// produce then after producing producer
									// notify consumer about the production

		}
	}

}

class Consumer implements Runnable {
	List<Integer> sharedList = null;

	public Consumer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		
		while (true) {
			try {
				Consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void Consume() throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.isEmpty()) {
				System.out.println("Share list is Empty ,waiting for the producer to produce");
				sharedList.wait();
			}

		}
		synchronized (sharedList) {

			System.out.println("Consume Elemet :" + sharedList.remove(0));

			Thread.sleep(1000);
			sharedList.notify(); // if consumer is waiting for producer to
									// produce then after producing producer
									// notify consumer about the production

		}
	}

}
