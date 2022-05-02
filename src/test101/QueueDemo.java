package test101;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*********Queue using linked list implementation********");
		
		Queue<Integer> queue=new LinkedList<>();
	//	Queue<Integer> queue2=new PriorityQueue();
		//Queue<Integer> queue3=new ArrayDeque<>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);
		
		/*The only difference between the methods is that the offer method
		 *  throws true or false if the addition is made. As opposed to this, 
		 *  the add method throws an exception when no more additions are possible 
		 *  in the queue.
		 * 
		 */
		
		
		queue.offer(600);
		System.out.println(queue);
		
		int val =queue.poll(); // remove and return first inserted value and return null if it is emppty
		System.out.println(val); 
		System.out.println(queue);
		
		System.out.println("---------------Remove :-----------");
		
		int val2=queue.remove();
		System.out.println(val2);
		System.out.println(queue); //throws an exception if queue is empty
		System.out.println("--------------------------");
		
		int val3=queue.peek(); //retrive the value by not removing it 
		System.out.println(val3);
		System.out.println(queue);
		System.out.println("--------------------------");
		
		int val4=queue.element(); //throws an exception if queue is empty 
		System.out.println(val4);
		System.out.println(queue);
		System.out.println("--------------------------");
		
System.out.println("*********Queue using Priority Queue implementation********");
		
	//Unlike normal queuepriority queue elements are retrieved  in sorted order
		Queue<Integer> queue2=new PriorityQueue(new IntegerComparator());
		//Queue<Integer> queue3=new ArrayDeque<>();
		queue2.add(700);
		queue2.add(50);
		queue2.add(100);
		queue2.add(400);
		queue2.add(500);
		
		System.out.println("print the queue 	"+queue2);
		
		Iterator<Integer> itr=queue2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		while(queue2.peek()!=null)
		{
			System.out.println(queue2.poll());
		}
		
		/*
		 * Priority use heap aerea to store all the lement and dute to rhis heap we ra e not able to see all element in ascending order
		 * 
		 * 
		 */
		System.out.println("print the queue "+queue2);
		
		
		
		
		
		
		
		

	}

}
