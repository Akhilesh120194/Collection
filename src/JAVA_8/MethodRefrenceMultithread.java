package JAVA_8;

public class MethodRefrenceMultithread {

	public void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		MethodRefrenceMultithread mt=new MethodRefrenceMultithread();
		Runnable r=mt::m1;
		Thread t1=new Thread(r);
		t1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}

}
