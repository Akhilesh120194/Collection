package JAVA_8;

import java.util.function.Consumer;

/*
 * The consumer interface of the functional interface is the one that accepts only one argument or a gentrified argument.
 *  The consumer interface has no return value. It returns nothing. There are also functional variants 
 * of the Consumer — DoubleConsumer, IntConsumer, and LongConsumer. These variants accept primitive values as arguments. 
 */

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> c=s->System.out.println(s);

		c.accept("Hello");
	}

}
