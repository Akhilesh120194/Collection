package test101;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Student_001> set = new LinkedHashSet<>();
		Student_001 s1 = new Student_001("Shubham", "tomar");
		Student_001 s2 = new Student_001("Yuvraj", "tomar");
		Student_001 s3 = new Student_001("Kartik", "tomar");

		set.add(s1);
		set.add(s2);

		System.out.println(set);

		LinkedList<Student_001> l1 = new LinkedList<>();
		Student_001 s4 = new Student_001("Mohan", "tomar");
		Student_001 s5 = new Student_001("Prateek", "tomar");
		l1.add(s4);

		System.out.println(l1.addAll(0, set)); // adding set(collection) at
												// particular index
		System.out.println(l1);

		l1.add(2, s5); // add object at patyicular index
		System.out.println(l1);

		l1.remove(0);// removing by index
		System.out.println(l1);
		l1.remove(s2);// remove by elemt/object
		System.out.println(l1);

		LinkedList<Student_001> l2 = new LinkedList<>();
		Student_001 s6 = new Student_001("Mohan", "tomar");
		Student_001 s7 = new Student_001("Prateek", "tomar");
		l2.add(s6);
		l2.add(s7);

		System.out.println("Second Link list" + l2);
		System.out.println("Get value by index " + l2.get(1)); // get value by
																// index
		System.out.println("Get index by vaue " + l2.indexOf(s6)); // get value
																	// by index

		System.out.println(l2);
		l2.set(1, s1); // updating the value by index 
		System.out.println(l2);

		LinkedList<Student_001> l3 = new LinkedList<>();
		Student_001 s8 = new Student_001("Mohan", "tomar");
		l3.add(s8);
		l2.retainAll(l3); // Retained object psnt in l3 and remove all
		System.out.println("retained List " + l2);

		l1.removeAll(l2);
		System.out.println(l1);

		// Linked list to array conversion
		LinkedList<Student_001> l4 = new LinkedList<>();
		Student_001 s10 = new Student_001("Rahul", "tomar");
		Student_001 s11 = new Student_001("Raj", "tomar");
		l4.add(s10);
		l4.add(s11);

		System.out.println(l4);

		Student_001[] stud = new Student_001[l4.size()];
		Student_001[] xyz = l4.toArray(stud); // return array of type
												// Student_001

		Object[] obj = l4.toArray();// Return the object array
		// System.out.println(xyz);

		for (int i = 0; i < xyz.length; i++) {

			System.out.println("Hello  " + xyz[i]);
		}

		// Using Object array
		for (Object obj2 : obj) {
			Student_001 stud3 = (Student_001) obj2;
			System.out.println("object   " + stud3);
		}

		// Peek and Poll
		LinkedList<Integer> lp = new LinkedList<>();

		lp.add(100);
		lp.add(200);
		lp.add(300);
		lp.add(400);

		System.out.println(lp);

		System.out.println(lp.peek()); // retrive but not remove
		System.out.println(lp.peekFirst());
		System.out.println(lp.peekLast());

		System.out.println(lp);
		System.out.println(lp.poll()); // remove first elemnt
		int j = lp.pollLast();
		System.out.println(j);// remove last
		System.out.println(lp);

		lp.add(400);
		lp.add(500);
		lp.add(200);
		lp.add(600);
		lp.add(200);
		System.out.println(lp);
		System.out.println(lp.removeFirst());
		System.out.println(lp);
		lp.removeFirstOccurrence(200);// removed first occur 200
		System.out.println(lp);

		ListIterator<Integer> itr_1 = lp.listIterator();

		while (itr_1.hasNext()) {

			Integer value = itr_1.next();
			System.out.println(value);

			if (value == 600) {
				itr_1.set(700);   //Replacing the value 
			}
			
			if(value==400)
			{
				itr_1.remove();  //remove the value 
			}

		}

		 System.out.println(lp);
	
		 //Iterating in backward direction

			while (itr_1.hasPrevious()) {

				Integer value = itr_1.previous();
				System.out.println(value);

				

			}
		 
		 
		 
	}

}
