package JAVA_8;

import java.util.TreeMap;

public class TreeMapComparator {
	
	public static void main(String[] args) {
		
	//	TreeMap<Integer,String> m1=new TreeMap<>(); //Ascending order 
		TreeMap<Integer,String> m1=new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0); //Descending order
		
		m1.put(10,"Sunny");
		m1.put(70,"Bunny");
		m1.put(80,"Munny");
		m1.put(100,"Tunny");
		m1.put(90,"Nunny");
		
		System.out.println(m1);
		
	}

}
