package test101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Fail fast Iterator immediatedly throws Concurrent modification Ecception if a collection is modified(Change the
 * structure of collection) while iterating over it . 
 * fail fast iterator uses original collection to traverse/iterate the element
 * fail_fast_iterator does not require additional memory as it iterate over the collection itself
 * Ex: ArrayList,HashMap,Vector
 */
public class Fail_Fast_Demo {
	
	public static void main(String[] args)
	{
		//Same applicability for HashMap and vector
		List<String> l1=new ArrayList<>();
		List<String> l2 =Arrays.asList("Sachin","Laxman");  //It is immutable
		l1.add("A");
		l1.add("Z");
		l1.add("B");
		l1.add("C");
		l1.addAll(l2);
		
		System.out.println(l1);
		
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext())
		{
			String val=itr.next();
		//	System.out.println(itr.next());
			//l1.add("L");  //Concurrent Modification Exception 
		//	l1.remove("C");  //Concurrent Modification Exception
			l1.remove(3);////Concurrent Modification Exception
			//l1.set(1,"P");  //Here structure of list is not changing
			
			//iterator is working as expected .
			if(val.equals("Z"))
			{
				itr.remove();
			}
		}
		System.out.println(l1);
		
		
		Iterator<String> itr2=l1.iterator();
		while(itr2.hasNext())
		{
			String val=itr2.next();
		//	System.out.println(itr2.next());
	//		l2.add("L");  //Unsupported Operation Exception
		//	l2.remove("C");  //Unsupported Operation Exception
		//	l2.remove(3);////Unsupported Operation Exception
			//l2.set(1,"P");  //Here structure of list is not changing
			
			//iterator is working as expected .
		/*	if(val.equals("C"))
			{
				itr2.remove();
			}*/
		}
		System.out.println(l2);
	}

}
