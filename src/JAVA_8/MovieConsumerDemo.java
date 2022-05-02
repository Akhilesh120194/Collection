package JAVA_8;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie
{
String name;
String hero;
String heroine;
public Movie(String name, String hero, String heroine) {
	super();
	this.name = name;
	this.hero = hero;
	this.heroine = heroine;
}
@Override
public String toString() {
	return "Movie [name=" + name + ", hero=" + hero + ", heroine=" + heroine + "]";
}



}

public class MovieConsumerDemo {
 
	
	public static void main(String[] args) {
		ArrayList<Movie> al=new ArrayList<>();
		populate(al);
		
		Consumer<Movie> c=m->{
			System.out.println("Movie name : "+m.name);
			System.out.println("hero name : "+m.hero);
			System.out.println("heroine name : "+m.heroine);
		};

System.out.println(al);
for(Movie m:al)
{
c.accept(m);	
}

	}

	private static  void populate(ArrayList<Movie> al) {
		al.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		al.add(new Movie("Raeesh", "Shahrukh", "Sunny"));
		
	}

}
