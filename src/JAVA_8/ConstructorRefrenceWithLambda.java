package JAVA_8;

interface interf_Ref {
	public Sample get();
}

class Sample {
	public Sample() {

		System.out.println("Sample Constructor object creation starts");
	}
}

public class ConstructorRefrenceWithLambda {

	public static void main(String[] args) {
		
		interf_Ref i1=()->{Sample s=new Sample();
			return s;};

	}

}
