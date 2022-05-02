package JAVA_8;

import java.util.TreeSet;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	TreeSet<Integer> t1=new TreeSet<>();
		TreeSet<Integer> t1=new TreeSet<>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		t1.add(70);
		t1.add(20);
		t1.add(50);
		t1.add(10);
		t1.add(80);
		
		System.out.println(t1);

		
	}

}
