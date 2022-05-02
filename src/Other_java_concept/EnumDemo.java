package Other_java_concept;

/*
 * Enum is a group of named constant . every named constant is public ,static and final by default i.e it
 *  can be accessed by enum name .
 *  
 *  Enum can be defined inside the class and outside the class but not inside the method .
 *  
 *  Every enum is a direct child class of java.lang.Enum Class so it can't extend any other java class 
 *  as multiple inheritance is not supported in java .
 *  
 *  Every enum is always final implicitly and hence we can't create child enum .
 *  We can't use extend keyword in case of enum .
 *  
 *  Every enum  impicitly contains  values() method that return all the values present inside enum 
 *  eg.  Beer[] b=Beer.values();
 *  
 *  We can find the ordinal value of enum constant by using ordinal() method . eg. public final int ordinal();
 *  
 *  We can't crea
 *  
 *  Switch(x)  ;x can be byte ,short ,int ,char enum and their object type class .
 * 
 */

enum Beer
{
KF,Tuborg,RC,RS;	//Beer KF=new Beer(); -->every constant of type enum Beer is static hence these constant created at the time of class loading .
	//When loading happens ? -->When any of the called .
	//How many time constructor will call?-->no of named constant 
	
	 Beer() {
		// TODO Auto-generated constructor stub
		 System.out.println("Enum constructor ");
	}
	
	
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beer b1=Beer.KF;
		
	//	Beer b2=new Beer(); -->We can't create enum object(named constant) explicitly i.e we can't invoke enum constructor directly
		System.out.println(b1);
		
		switch(b1)
		{
		case KF :
			System.out.println("Kingfisher ");
			break;
			
		case RC:
			System.out.println("Kingfisher ");
			
		default:
				System.out.println("hello");
		}
		
		Beer[] b=Beer.values(); 
		
		for(Beer bix:b)
		{
			System.out.println(bix +" "+bix.ordinal());
		}
		
		System.out.println(Beer.values());

	}
	

}
