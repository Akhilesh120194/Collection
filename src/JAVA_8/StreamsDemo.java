package JAVA_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/*
 * If you want to process objects from colection then we should go for strams .
 * stream is a default method present inside Stream interface .
 * 
 * Stream s=c.stream() ;//where c is any collectionn object .and Stram is an interface present 
 * inside java.util.stream package .
 * 
 * Filter :If we want to filter elements from the collection based on some boolean condition then we should go 
 * for filtering .We can configure filter by using filter() method of Stream interface .
 * 
 * Map : If we want to create separate object for every object present inside the collection based on some function 
 * then we should go for mapping mechanism .We can implement map() method of Stream interface .
 * 
 *collect() :This method collects elements from the stream and adding to the specified collection .
 *
 *count() :this method returns the no of elements presents in the stream .
 *public long count();
 *
 *sorted() :we can use sorted() method to sort elements inside Stream.
 *1.sorted() ==>For DNSO
 *2.sorted(Compartor c) :For customized sorting order 
 *
 *min() and max() :Return min and max element present inside the collection .
 *
 *forEach() :This method won't return anything .t=This method can take lambda expression as argument and apply that 
 *expression for each element present in Stream .
 * 
 */

public class StreamsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(13);
		al.add(10);
		al.add(22);
		System.out.println(al);
		/*ArrayList<Integer> al2=new ArrayList<>();
		for(Integer no:al)
		{
			if(no % 2==0)
			{
				al2.add(no);
			}
		}
		System.out.println(al2);*/
		
		ArrayList<Integer> al2=(ArrayList<Integer>) al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(al2);
		
		ArrayList<Integer> al3=(ArrayList<Integer>) al.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(al3);
		
		
		//For DNSO
		ArrayList<Integer> al4=(ArrayList<Integer>) al.stream().sorted().collect(Collectors.toList());
		
		System.out.println(al4);
	//For Customized sorting order	
ArrayList<Integer> al5=(ArrayList<Integer>) al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println(al5);
		
		//print min value from the collection 	
		int min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min Value "+min);
		//print max value from the collection 			
		int max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value "+max);
				
		
		List<String> l1=new ArrayList<>();
		l1.add("Ramkumar");
		l1.add("Venkatesh");
		l1.add("Chiranjeevi");
		l1.add("Nagarjuna");
		
		List<String> l2=l1.stream().filter(s->s.length()>8).collect(Collectors.toList());
		System.out.println(l2);
		
		List<String> l3=l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l3);
		
		long count=l1.stream().filter(s->s.length()>8).count();
		System.out.println(count);
		
		
		

	}

}
