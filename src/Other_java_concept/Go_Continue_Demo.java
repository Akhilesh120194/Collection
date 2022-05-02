package Other_java_concept;

public class Go_Continue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakLoopDemo br1=new BreakLoopDemo();
		ContinueDemo c1=new ContinueDemo();
		br1.break_Demo();
		
		c1.continue_Demo();

	}

}

//Java program to illustrate using
//break to exit a loop
class BreakLoopDemo
{
 public static void break_Demo()
 {
	 System.out.println("Java program to illustrate using break to exit a loop");
     // Initially loop is set to run from 0-9
     for (int i = 0; i < 10; i++)
     {
         // terminate loop when i is 5.
         if (i == 5)
             break;

         System.out.println("i: " + i);
     }
     System.out.println("Loop complete.");
 }
}


//Java program to illustrate using continue in an if statement
class ContinueDemo
{
	
	
 public static void continue_Demo()
 {
	 System.out.println("Java program to illustrate using continue in an if statement");
     for (int i = 0; i < 10; i++)
     {
         // If the number is even
         // skip and continue
         if (i%2 == 0)
             continue;

         // If number is odd, print it
         System.out.print(i + " ");
     }
 }
}