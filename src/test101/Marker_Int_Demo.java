package test101;

/*
 * Let's take the example of the Cloneable interface. If we try to clone an object that doesn't 
 * implement this interface, the JVM throws a CloneNotSupportedException. Hence, the Cloneable marker 
 * interface is an indicator to the JVM that we can call the Object.clone() method.
 * 
 */

interface Test {

}

class Demo1 implements Test {
	public void clone1() {
		System.out.println("Hello");
	}
}

class Demo2 {
	public void clone1() {
		System.out.println("Hi");
	}
}

public class Marker_Int_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		if (d1 instanceof Test) {
			d1.clone1();
		} else {
			System.out.println("Not permitted");
		}
		if (d2 instanceof Test) {
			d2.clone1();
		}

		else {
			System.out.println("Not permitted");
		}

	}
}
