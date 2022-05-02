package Other_java_concept;

//Converting  primitive data type to Object type is called wrapping in java also know as Autoboxing .

public class Wrapper_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=Integer.valueOf("77");
		System.out.println(i1);
		Double d1=Double.valueOf("77.88");
		System.out.println(d1);
		int i2=Integer.parseInt("979");
		System.out.println(i2);
		
		int i3=i1.intValue();
		System.out.println(i3);
		
		int p=2;
		int q=2;
		
		System.out.println(p==q); //true
				
		
		
		Integer x=new Integer(10);
		Integer y=new Integer(10);
		//here both x and y are different object created by new operator 
		System.out.println(x==y); //false
		
		Integer a=new Integer(20);//creating a integer object by new operating 
		Integer b=20; //creating integer object by autoboxing
		System.out.println(a==b); //false
		
		Integer x1=20;
		Integer x2=20; //If an object require by autoboxing and if it is already available it is always going to use existing value only .
		//within the buffered range -128 to 127 
		System.out.println(x1==x2);  //true
		
		Integer y1=100;
		Integer y2=100; //If an object require by autoboxing and if it is already available it is always going to use existing value only .
		//within the buffered range -128 to 127  so existing value of y1 i.e 100 is used by y2
		System.out.println(y1==y2);  //true
		
		Integer a1=128;
		Integer a2=128; //If an object require by autoboxing and if it is already available it is always going to use existing value only .
		//not within the buffered range -128 to 127 so it will create new object for both a1 and a2
		System.out.println("Hello"+(a1==a2));  //false
		
		/*
		 * By autoboxing if it is required to create object first it will check it is within the range or not .If it is already 
		 * available it will use the existing one only and if it is not available it will create new object.
		 * 
		 * 
		 * Buffered range for different type of object are as follows :
		 * Byte :  -128 to 127
		 * Short :  -128 to 127 
		 * Integer :  -128 to 127 
		 * Long  :-128 to 127 
		 * Character : 0 to 127 
		 * Boolean :  Always 
		 * 
		 * Note : Buffered concept is not applicable for Double and Float Object i.2 every time even by autoboxing 
		 * new object will be created .
		 * 
		 * Internally Autoboxing is implemented by using Integer.valueOf(100);
		 * 
		 * 4 Utility methods of Wrapper class :
		 *1.valueOf();  --->We can use valueOf() method  to create wrapper class object for the given primitives and Strings .
		 *ex:  Integer int1=Integer.valueOf(100);
		 *	   Integer int1=Integer.valueOf("100");
		 *
		 *All wrapper class except Character class conains static valueOf() method to create wrapper object for the given string .
		 *ex:Integer int1=Integer.valueOf("100");
		 *   Float	 f=Float.valueOf("10.5f");
		 *   Double	 d=Double.valueOf("10.5");
		 *   Boolean b=Boolean.valueOf("10.5f");
		 * 
		 *By using value() method we have achieved the object reusability .Autoboxing also internally using this method 
		 *
		 *2.xxxValue(); -->this method is used to find the primitive value of the given wrapper object
		 *{where xxx can be byte,short,int,long,float,double etc .Total 36 possible combination}
		
		 *
		 *Integer I1=new Integer(130);

		  Converting wrapper class object to different primitive type as follows :
		System.out.println(I1.byteValue());
		System.out.println(I1.shortValue());
		System.out.println(I1.longValue());
		System.out.println(I1.intValue());
		System.out.println(I1.doubleValue());
		System.out.println(I1.floatValue());
		 *
		 *3.ParseXxx(); -->It is used to find primitive value for the given string .
		 *Ex:  int i=Integer.parseInt("10");
				float f=Float.parseFloat("10.5f");
				double d=Double.parseDouble("10.6");
				boolean b1=Boolean.parseBoolean("true");
			
		4 .  toString (); -->It is used to find String for the given primitive value or wrapper object
				
		 */
		
		
		//.valueOf():-->Converting primitive value to wrapper class object 
		System.out.println(".valueOf():-->Converting primitive value to warapper class object");
		Integer int1=Integer.valueOf(100);  //Autoboxing
		Integer int2=Integer.valueOf(100);   //Autoboxing
		System.out.println("Jjjj "+(int1==int2));   //In case of autoboxing resuluability is applicable if it already exuist 
		 
		Integer I1=new Integer(130);

		//Converting wrapper class object to different primitive type as follows :
		System.out.println(".xxxValue(): -->Converting wrapper class oobject to different primitive type as follows :");
		System.out.println("lklkjlk  "+I1.byteValue());
		System.out.println(I1.shortValue());
		System.out.println(I1.longValue());
		System.out.println(I1.intValue());
		System.out.println(I1.doubleValue());
		System.out.println("KJnkcn  "+I1.floatValue());
		
		//ParseXxx(); -->It is used to find primitive value for the given string 
		
		System.out.println("ParseXxx(); -->It is used to find primitive value for the given string ");
		
		int i=Integer.parseInt("10");
		float f=Float.parseFloat("10.5f");
		double d=Double.parseDouble("10.6");
		boolean b1=Boolean.parseBoolean("true");
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b1);
		
		// toString (); -->It is used to find String for the given primitive value or wrapper object
		
		System.out.println("toString (); -->It is used to find String for the given primitive value or wrapper object");
		
		Integer integer=new Integer(20);
		String s=integer.toString();
		System.out.println(s);
		
		System.out.println("****************boolean****************");
		Boolean bol1=new Boolean("true");  //true
		Boolean bol2=new Boolean(true);//true
		
		System.out.println(bol1.equals(bol2));//true
		
		Boolean bol3=new Boolean("true");//true
		Boolean bol4=new Boolean("TruE");//true
		
		System.out.println(bol3.equals(bol4));//true
		
		Boolean bol5=new Boolean("hey");//false
		Boolean bol6=new Boolean("ByE");//false
		
		System.out.println(bol5.equals(bol6));//true
		
		
		
		
				
				
	}

}
