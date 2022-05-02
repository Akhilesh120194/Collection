package JAVA_8;

interface interf_Ref2 {
	public Sample get();
}

class Sample2 {
	public Sample2() {

		System.out.println("Sample Constructor object creation starts");
	}
}

public class ConstructorRefrenceWithMethodrefrence {

	public static void main(String[] args) {
		
		interf_Ref i=Sample::new;
		
		
		Sample s=i.get();
	}

}
