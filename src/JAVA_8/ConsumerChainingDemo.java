package JAVA_8;

import java.util.function.Consumer;

class MovieDemo {
	String name;
	String result;

	public MovieDemo(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}

}

public class ConsumerChainingDemo {

	public static void main(String[] args)
	{
		Consumer<MovieDemo> c1=m->System.out.println("movie "+m.name+" is ready to release");
		Consumer<MovieDemo> c2=m->System.out.println("movie result "+m.result);
		Consumer<MovieDemo> c3=m->System.out.println("movie name and result stored in DB");
		
		Consumer<MovieDemo> chainedConsumer=c1.andThen(c2).andThen(c3);
		
		MovieDemo movie=new MovieDemo("bahubali", "hit");
		
		chainedConsumer.accept(movie);
	}
}
