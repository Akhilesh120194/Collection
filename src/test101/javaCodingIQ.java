package test101;

import java.lang.Thread.State;
import java.util.HashSet;
import java.util.Set;

public class javaCodingIQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isogramDemo("Pen"));
	}

	

	public static  boolean isogramDemo(String s) {
		boolean isogram = true;
		char[] ch = s.toCharArray();
		Set<Character> chset = new HashSet<>();
		
		System.out.println(ch);
		System.out.println(chset);
		
		for(Character c:ch)
		{
			if(chset.contains(c))
			{
				return false;
			}
			else
			{
				chset.add(c);
			}
		}
		return isogram;

	}
}
