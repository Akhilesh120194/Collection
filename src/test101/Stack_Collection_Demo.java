package test101;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/*
 * Stack operates on last in first out Model .
 */

public class Stack_Collection_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st1=new Stack<>();
		st1.push(100);
		st1.push(300);
		st1.push(200);
		st1.push(500);
		System.out.println("After Pushing");
		System.out.println(st1);
		
		System.out.println(st1.indexOf(100));
		
		System.out.println("After popping");
		st1.pop(); //Element removed from the top(last pushed element)
		System.out.println(st1);
		
		System.out.println("Peeking");
		int val=st1.peek(); //return the last pushed element
		System.out.println(val);
		System.out.println(st1);
		
		System.out.println("Checking Empty method");
		boolean status=st1.isEmpty();  
		System.out.println(status);
		System.out.println(st1);
		
		
		System.out.println("Checking Search method");
		int position=st1.search(100);  //return the position of element from the top
		System.out.println(st1);
		System.out.println("Positio of 100 is  "+position);//position from top of stack
		System.out.println("index of 100 is  "+st1.indexOf(100));
		
		
		
		
		System.out.println("Forward Iterating");
		ListIterator itrf=st1.listIterator();  
		
		while(itrf.hasNext())
		{
			System.out.println(itrf.next());  //Iterator starts iterating from the first pushed element i.e from 0th index
		}
		
		
		System.out.println("Backward Iterating");

		ListIterator<Integer> itrb=st1.listIterator();
		
		try {
			while(itrb.hasPrevious())
			{
				System.out.println(itrb.previous());  //Iterator starts iterating from the first pushed element i.e from 0th index
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("**************Array*************");
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(50);
		
		/*ListIterator itrfr=al.listIterator();  
		
		while(itrfr.hasNext())
		{
			System.out.println(itrfr.next());  //Iterator starts iterating from the first pushed element i.e from 0th index
		}*/
		System.out.println("Array backward");
ListIterator itrbr=al.listIterator();  
		
		while(itrbr.hasPrevious())
		{
			System.out.println(itrbr.previous());  //Iterator starts iterating from the first pushed element i.e from 0th index
		}

		
	}

}
