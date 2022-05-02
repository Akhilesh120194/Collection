package test101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ArraylistintoHashSet {
//ArrayList cannot be cast in to hashset	
	public static void main(String args[]){  
		
		 LinkedHashSet<Student_001> set=new LinkedHashSet<>();  
		 Student_001 s1=new Student_001("akhil","tomar");
			Student_001 s2=new Student_001("akhilesh","tomar");
			Student_001 s3=new Student_001("akhilesh","tomar");
         set.add(s1); 
         set.add(s2);
         set.add(s3);
         
       //  System.out.println(set.add(s1));
         
         ArrayList<Student_001> al=new ArrayList<>();  
		 Student_001 s4=new Student_001("DK","tomar");
			Student_001 s5=new Student_001("DK2","tomar");
			Student_001 s6=new Student_001("DK3","tomar");
			 al.add(s4); 
	         al.add(s5);
	         al.add(s6);
	      //   al.addAll(set);
	     //    System.out.println(al.addAll(set));
	         
	    //     set.addAll(al); //
         
        System.out.println(set.addAll(al));  //addALL()
        
        System.out.println(set.size());  //set.size();
        
        System.out.println(set.isEmpty()); //isEmpty();
        
        HashSet<Student_001>clone_set=(HashSet<Student_001>) set.clone();  
        
        System.out.println("Clone_set :"+clone_set);
        
        System.out.println(set.contains(s2)); //True
        
        System.out.println(set);
        
    
        
        set.remove(s6);//DK3 should remove
        
        System.out.println(set);
        
        System.out.println("al should contained "+set.contains(s1));
        
        set.removeAll(al);//set 2 should remove
        
        System.out.println(set);
        
        for(Student_001 std:set)
        {
        	System.out.println(std.getFname()+"  "+std.getLname());
        	
        }
        
        Iterator<Student_001> it=set.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        	
        }
        
        System.out.println(set.isEmpty());
        
        set.clear();
        
        System.out.println(set);
	}

}
