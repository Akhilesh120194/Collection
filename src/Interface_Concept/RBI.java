package Interface_Concept;

/*First Lets talk about what is interface in java and what is the use of interface in java ? 

So when we know the specification but not aware of the implementation, then we should go for an interface.

Then the next question will be what is abstract class in java and what is the use of abstract class in java ? 

The answer is very simple, When we know the partial implementation then we should prefer abstract class.

The interface doesn't have a constructor but the abstract class in Java can have constructor within 
it.
 * 
 * 
 * 1.interface preceeded by keyword interface which abstract class preceeded by keyword abstract
 * Interface keywork used to declare interface while abstract keyword used to declare abstract class
 * 2.When to declare interface and when to declare abstract class ?
 * Ans:In interface we can achieve multiple inheritance means one class can implement multiple interface .
 * 
 * 3.variables declared in java interface are d=by default public,static and final while there is no cumpulsion in
 *  absract class
 * 4.In interface we must initialize variable while there is no cumpulsion in absract class
 * 
 * 
 */

public interface RBI {
	
	void withdraw();
	void deposit();
	
	//default concrete method with implementation can be added to interface from java 18 version onwards
	
	public default void adhharLink()
	{
		System.out.println("Link our adhaar card");
	}
	
	public default void minBal()
	{
		System.out.println("Connect your bank to know aboyt min balance policy");
	}

}

class SBI implements RBI
{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}
	
}
