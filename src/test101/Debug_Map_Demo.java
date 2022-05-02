package test101;

import java.util.HashMap;

public class Debug_Map_Demo {
	
	
	public static void main(String[] args)
	{
		
		HashMap<Integer, String> map1=new HashMap<>();
		
		map1.put(1, "Akhil");
		map1.put(2, "DK");
		
		String s1="FBd";
		String s2="Ea";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(map1.hashCode());
		
	}

}
