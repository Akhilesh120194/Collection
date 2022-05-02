package test101;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		List<String> list1=new ArrayList<>(3);
		list1.add("One");
		list1.add("two");
		list1.add("three");
		
		System.out.println("After insertin 3rd elemets,size of array list : "+list1.size());
		list1.add("four");
		
		System.out.println("After insertin 4th elemets,size of array list : "+list1.size()); //Since
		
		BlockingQueue<String> bq=  new ArrayBlockingQueue(3);
		bq.put("one");
		bq.put("two");
		bq.put("three"); // after inserting 3rd element bq will be in waiting state 
		
		System.out.println("After insertin 3rd elemets,size of blocking queue : "+bq.size());
	//	bq.poll();
		bq.put("four");
	
		System.out.println("After insertin 4th elemets,size of Blocking Queue : "+bq.size()); //Since
		
	//	bq.poll();
	//	System.out.println("After insertin 4th elemets,size of Blocking Queue : "+bq.size()); //Since
		


	
		

	}

}
