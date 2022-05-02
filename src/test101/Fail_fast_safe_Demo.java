 package test101;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Enumeration iterator can only be used with vector 
 * iterator can be used with all the collection implemented class.
 * list iterator is applicable for list interface .
 * 
 * 
 */

public class Fail_fast_safe_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList<String> names=new CopyOnWriteArrayList<>();
		names.add("Akhil");
		names.add("Dk");
		names.add("Shyam");
		
		Thread t1=new Thread()
				{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Iterator<String> itr=names.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}
				}; 
				t1.start();
				
				Thread t2=new Thread()
				{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			names.add(3,"Shubham");
			
		}
				}; 
				t2.start();
				

	}

}
