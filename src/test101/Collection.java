package test101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection {
	
	public static void main(String args[]){  
		
		 HashSet<Integer> set9=new HashSet<>(); 
		 set9.add(10);
		 set9.add(20);
		 System.out.println(set9.add(10));
	
		 
		
		
		 HashSet<Student_001> set=new HashSet<>();  
		 Student_001 s1=new Student_001("akhil","tomar");
			Student_001 s2=new Student_001("akhil","tomar");
         set.add(s1); 
         set.add(s2);
         
         HashSet<Student_001> set5=new HashSet<>();  
		 Student_001 s5=new Student_001("akhil","tomar");
			Student_001 s6=new Student_001("akhil","tomar");
         set5.add(s5); 
         set5.add(s6);
         
         set.addAll(set5);
         
         System.out.println(set.addAll(set5));
         
         ArrayList<Student_002> al=new ArrayList<>();
         Student_002 s3=new Student_002("DK","tomar");
         Student_002 s4=new Student_002("DK2","tomar");
      al.add(s3); 
      al.add(s4);
      
    // System.out.println(set.getClass().getName()); 
      
      Set set2 = new HashSet ( al );
      set.addAll(set2);  
      
    //  System.out.println( set.addAll(al));
  
      System.out.println( set);
      
     // Collections.addAll(set, set2);
         
     // set.addAll(set2);
    //  System.out.println(set.size());
         
         
   /*   System.out.println(set.size());
      System.out.println(set.isEmpty());
      System.out.println(set.clone());
      System.out.println(set.contains(s2));*/
  //    set.clear();
   //   set.removeAll(set2);
      //System.out.println(set);
        // System.out.println(s2);
         /*for (Student_001 std : set) {
        	 System.out.println(std);
        //     System.out.println(std.getFname() + " " + std.getLname());
         }*/
		
      
      Iterator<Student_001> it = set.iterator();
      
      while (it.hasNext()) {
          
          Student_001 element = it.next();
          
        
          
          
          System.out.println("First_Name "+element.getFname()+" Last_Name "+element.getLname());
      }
      
 
      
	
		
	}
	}

//How to iterate when set contains different user defined object

