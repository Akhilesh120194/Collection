package JAVA_8;


/*Functional interface is used to invoke lambda exprwession .Functioanl interface should contac=ain 
 * only one abstract method because if it contain more than one abstract  method with same type of 
 * argument then while ivoking the lambda expression compie will get confused .
 * 
 * lambda expression is mapped to some method of functional interface if there are multipleabstract method
 *  problemm will occur
 * 
 * 
 */

/*class MyRunnable1 implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<=10;i++)
		{
			System.out.println("Child thread");
		}
		
	}
}
*/
public class ThreadDemoWithLambda {

	public static void main(String[] args) {
		
		Runnable r1=()->{	for(int i=0;i<=10;i++)
		{
			System.out.println("Child thread");
		}
		};
		
		Thread t=new Thread(r1);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread");
		}
			
		

	}

}


