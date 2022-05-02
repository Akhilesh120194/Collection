package test101;

import java.util.HashMap;
import java.util.Map;

public class ConsumerApp {

	public static void main(String[] args) {

		// FakeConsumer fc = new FakeConsumer("Akhileshwar");
		Consumer c1 = new Consumer("Ajay");

		HashMap<Consumer, String> map = new HashMap<>();
		map.put(c1, "India");

		System.out.println(map.get(c1));
		
		FakeConsumer fc = new FakeConsumer("Akhileshwar");
		System.out.println(map.get(c1));
		
		System.out.println("***************");
		
		Consumer c2 = new FakeConsumer("Abhilah");

		HashMap<Consumer, String> map1 = new HashMap<>();
		map1.put(c2, "India");

		System.out.println(map.get(c2));
		
		
		

	}

}
