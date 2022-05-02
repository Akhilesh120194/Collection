package Other_java_concept;

/*
 * hashcode of object is calculated by using the memnory address of object .
 * 
 * Each object has a unique memory address which helps hashcode() to generate unique hashcode for each object .
 * If we also want to check the content of object/user defined object then we need to override the equals method as well
 * 
 * A good hashcoded shoud return distinct integer for each object but we can't gaurantee that hashcode() given
 integer can't be repeat  for oer object class --->two different obect can also have same hashcode .
 
 If two strings are equal then their hashcode would be same but viceversa is not trtue 
 
 String are immutable because string objects are cached in String pool .Since cached string literals are shared among 
 different objects there is always a risk where one object'saction would affect all other persons.
 
  String class is  final so that no other can extend it and manipulate it .
 
 * 
 * 
 */

public class Test_hash_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=null;
		String str2="Ganesh";
		String str3="Ganesh";
		
		System.out.println("str2.equals(str3) "+str2.equals(str3));//true
	//	System.out.println("str.equals(str3) "+str.equals(str3));//Null pointer exception
		System.out.println("str.equals(str3) "+str3.equals(str)); //false
		
		Human_hash akhil1 = new Human_hash(100, "Akhilesh2");
		Human_hash akhil2 = new Human_hash(100, "Akhilesh");
		
		System.out.println(akhil1.hashCode());

		System.out.println(akhil2.hashCode());
		//for user defined object equal() methods check the memory address of object for equality  
		System.out.println("user Defined Object Comparison " +akhil1.equals(akhil2));//
		
		boolean b=akhil1==akhil2;
		System.out.println("user Defined Object Comparison "+b);
		
		
	//akhil1 and akhil3 are pointing to same refrence
		Human_hash akhil3=akhil1;
		System.out.println("user Defined Object Comparison " +akhil1.equals(akhil3));
		
		
		String s1="Akhil";
		String s2="Akhil";
		/*For String it checks the content of string  .By using the below type declaration address assigned 
		 * according to content .if content is same for two string it should pint to same reference 
		 */
		
		System.out.println("String Content Comparison "+s1.equals(s2));
		System.out.println("String address Comparison "+(s1==s2));
		
		/*By using the below type declaration new address assigned each time at the declaration
		 .if content is same for two string equal operator eeturn true but == operator return false for two string comparison
		 
		 * 
		 */
		
		String s3=new String("DK");
		String s4=new String("DK");
		
		System.out.println("New String Content Comparison "+s3.equals(s4));
		
		System.out.println("New String address Comparison "+(s3==s4));
		
		
		String akhilesh=new String("akhilesh");
		System.out.println(akhilesh);
		System.out.println(akhilesh.hashCode());
		String str1=akhilesh.concat(" Tomar");  //it will create another object of string 
		System.out.println(akhilesh);
		System.out.println(str1);
		System.out.println(str1==akhilesh);
		System.out.println(akhilesh.hashCode());
		System.out.println(str1.equals(akhilesh));  
		
		/*
		 * password stored in char array is more secure than string array because strings are stord in SCP which is
		 * not applicable for garbae collection so in that some one can use it and tempered it .
		 */
		
		char[] ch=new char[]{'a','b','c'};
		System.out.println("Caracter array "+ch);//Print the refrence address
		String ch_sr=new String(ch);
		System.out.println(ch_sr);
	//	String str2="FB";
		
		
		
		//--------------------*****************---------------------------//
		
		Human_hash user1 = new Human_hash(1000, "Divyanshu");
		Human_hash user2 = new Human_hash(1000, "Divyanshu");
		Human_hash user3 = new Human_hash(1000, null);
		
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(null));
		System.out.println(user1.equals(user1));
		Wrapper_Demo wr1=new Wrapper_Demo();
		System.out.println(user1.equals(wr1)); //comparison take place betwenn same kind of object type ..it will give exception 
	
		System.out.println(user3.equals(user1));
	}

}
