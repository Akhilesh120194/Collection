package test101;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListing_copy {

	public static void main(String args[]){  
		
		ArrayList<Student_001> al=new ArrayList<>();  
		 Student_001 s1=new Student_001("akhil","tomar");
			Student_001 s2=new Student_001("akhilesh","tomar");
			Student_001 s3=new Student_001("akhilesh","tomar");
         al.add(s1); 
         al.add(s2);
         al.add(s3);
         
       //  System.out.println(al.add(s1));
         
         ArrayList<Student_001> al2=new ArrayList<>();  
		 Student_001 s4=new Student_001("DK","tomar");
			Student_001 s5=new Student_001("DK2","tomar");
			Student_001 s6=new Student_001("DK3","tomar");
			 al2.add(s4); 
	         al2.add(s5);
	         al2.add(s6);
	         
	         al.addAll(al2); 
        
	         
	       System.out.println(al);  
        System.out.println(al.addAll(al2));  //addALL()
        
System.out.println(al.size());  //al.size();

ArrayList<Student_001>clone_al=(ArrayList<Student_001>) al.clone();  

System.out.println("Clone_al :"+clone_al);

System.out.println(al.contains(s2)); //True

al.retainAll(al2); //except al2 all should get deleted 
System.out.println(al);

al.remove(1);  //remove by index

al.remove(s1);  //remove by object 

al.removeAll(al2); //remove by collection 

System.out.println(al);

al.addAll(al2);


System.out.println(al);

System.out.println(al.indexOf(s5));
System.out.println(al.lastIndexOf(s5)); //last index if duplicates are there
System.out.println(al.subList(0, 2));  //2nd element will be excluded
System.out.println(al.set(0, s1));  //return the replaced element
System.out.println(al);
//System.out.println(al2);
System.out.println(al.retainAll(al2));
System.out.println(al);



/*ListIterator<Student_001> litr=al.listIterator();

while(litr.hasNext())
{
System.out.println(litr.next());	
}*/
        
     //   System.out.println(al.isEmpty()); //isEmpty();

for(int i=0;i<al.size();i++)
{
System.out.println(al.get(i));	
}

for(Student_001 std:al)
{
	System.out.println(std.getFname()+"  "+std.getLname());
}

int i=0;

while(i<al.size())
{
System.out.println(al.get(i));
i++;
}
     
//Converting array list to string array 
//String[] str_array=new String[al.size()];
//al.toArray(str_array);
Object[] obj=al.toArray();

for(Object object:obj)
{
	object.getClass();
	Student_001 std=(Student_001) object;
	System.out.println(std);
	}

ListIterator<Student_001> litr=al.listIterator();




System.out.println("Forward");
while(litr.hasNext())
{
System.out.println("Forward"+litr.next());
int index=litr.nextIndex();

if(index==1)
{
Student_001 std=litr.next();
std.setFname("Divyanshu");  //updating through List Iterator
}
//litr.remove();
}

System.out.println("Updated List :"+al);

System.out.println("Reverse");
while(litr.hasPrevious())
{
System.out.println("Reverse direction"+litr.previous());	
//litr.remove();
}

ListIterator<Student_001> litr2=al.listIterator(1);
while(litr2.hasNext())
{
System.out.println("indexiterater"+litr2.next());	
//litr.remove();
}







	}
	
	
}
