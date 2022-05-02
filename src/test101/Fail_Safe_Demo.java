package test101;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Fail-Safe Iterator in java :
 * it does not throw any exception if a collection is modified while iterating over it 
 * It uses copy of original collection to iterate over it so it require additional space as it iterate over the 
 * copy of collection .
 * fail-Safe Iterator may not have the latest element in the collection as it iterate over the copy of collection 
 * Ex: ConcurrentHashMap ,CopyOnWriteArrayList.
 * 
 * ConcurrentHashMap doesn’t allow even a single null key and null value.
 * 
 * Why performance of concurrent hashmap is better than hashtable and synchronizedMap?
 * In hashtable and synchronizedMap lock is acquired on complete collections. Only single thread can capture lock at a time
 * while in concurrent Hashmap lock is acquired on bucket levels so at time multiple threads can capture lock on 
 * different buckets .
 * 
 * During write operation lock is acquired on a particular segment not on complete segment ,so two thread operating on different
 * segment can acquire lock on those segment without inteferring each others.
 * 
 * For read and get operation two threads can read data from the same or different segment of CC hshMap at the same time 
 * without blocking each  other
 * 
 * Concurrency level in Concurrent HashMap: It defines how many thread are allowed to get a lock .As default concurrent
 *  hashmap has 16 buckets and concurrency level has 16 values i.e by default 16 thread can take a lock at a time each per bucket 
 *  
 *  Why null not allowed in Concurrent HashMap while allowed in Hashmap?
 *  Suppose we have two threads T1 and T2 and T1 runs if condition and checks if some specific key is present in CCHashmap ,
 *  when it finds it goes and fetch its value but in the mean time second thread T2 deleted the key from the CCHMap so now t1
 *   gets the null value which is not  the case actually ,value was there but it was deleted by the thread ,,it's not the case of 
 *   HAshmap as it does not allow concurrent modification exception so deletion is not possible .
 *   
 *   How does Java know to throw ConcurrentModificationException?
 *   It uses a transient variable called modCount,which keeps track of how many times a list is modified structurally .
 *   Structural changes are those that changes the size of the list which may affect the progress of iteration 
 *   and may yield incorrect result .
 *   
 *   
 *   
 */

public class Fail_Safe_Demo {
	
	public static void main(String[] args)
	{
		//Same applicability for ConcurrentHashMap
		List<String> l1=new CopyOnWriteArrayList<>();
		l1.add("A");
		l1.add("Z");
		l1.add("B");
		l1.add("C");
		
		Iterator<String> itr=l1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		//	l1.add("J");
	//		l1.add(2,"Q");
			l1.remove("Z");
		//	itr.remove();  //In case of concurrent collection we cannot remove elements using iterator	
		}
		System.out.println(l1);
	}

}
