package JAVA_8;

/*
 * The biggest advantage of method reference is code reusability 
 * 
 * Method reference is used to refer method of functional interface.	
 * 
 * Method references are a special type of lambda expressions. 
 * They're often used to create simple lambda expressions by referencing existing methods.
 */
interface interf_Demo {
	public void m1();
}

public class MethodRefrenceDemo {

	public static void m2() {
		System.out.println("Static Method Refrence");
	}

	public void m3() {
		System.out.println("Non static Method Refrence");
	}

	public static void main(String[] args) {

		interf_Demo i1 = MethodRefrenceDemo::m2; // Here we can refer method
													// m2() for m1() using
													// method refrence
		/*
		 * One condition for the method refrenec : referring method and
		 * referenced method both have same type of argument
		 */
		i1.m1();

		MethodRefrenceDemo t = new MethodRefrenceDemo();
		interf_Demo i2 = t::m3;
		i2.m1();

	}

}
