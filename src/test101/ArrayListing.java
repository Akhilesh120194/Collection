package test101;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListing {
	// ArrayList cannot be cast in to hashal
	public static void main(String args[]) {

		ArrayList<Student_001> al = new ArrayList<>();
		System.out.println(al.size());
		Student_001 s1 = new Student_001("akhil", "tomar");

		Student_001 s2 = new Student_001("akhilesh", "tomar");
		Student_001 s3 = new Student_001("akhilesh", "tomar");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(10>>1);

		// System.out.println(al.add(s1));

		ArrayList<Student_001> al2 = new ArrayList<>();
		Student_001 s4 = new Student_001("DK", "tomar");
		Student_001 s5 = new Student_001("DK2", "tomar");
		Student_001 s6 = new Student_001("DK3", "tomar");
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);

		al.addAll(al2); // Array list can be put in to hashal but viceversa s
						// not true

		System.out.println(al);
		System.out.println(al.addAll(al2)); // addALL()

		System.out.println(al.size()); // al.size();

		System.out.println(al.isEmpty()); // isEmpty();

		ArrayList<Student_001> clone_al = (ArrayList<Student_001>) al.clone();

		System.out.println("Clone_al :" + clone_al);

		System.out.println(al.contains(s2)); // True

		System.out.println(al);

		al.remove(s6);// DK3 should remove

		System.out.println("DK3 should remove :" + al);

		System.out.println("al2 should contained " + al.contains(s1));

		al.removeAll(al2);// al 2 should remove

		System.out.println(al);

		for (Student_001 std : al) {
			System.out.println(std.getFname() + "  " + std.getLname());

		}

		Iterator<Student_001> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println(al.isEmpty());

		al.clear();

		System.out.println(al);

	}

}
