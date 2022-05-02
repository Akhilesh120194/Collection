package JAVA_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TestDemoComparatorWithLambda
{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();	
		l1.add(20);
		l1.add(10);
		l1.add(90);
		l1.add(70);
		
		Collections.sort(l1, (i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		System.out.println(l1);
		
		
	}


}

