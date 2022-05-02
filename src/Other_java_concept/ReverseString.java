package Other_java_concept;


import java.util.Scanner;
public class ReverseString {
public static void main(String[] args) 
{
	String str1="abc";
	String str2="abc";
	
	String str3=new String("abc");
	String str4=new String("abc");
	
	System.out.println(str1.equals(str2));
	System.out.println(str1==str2);
	System.out.println(str3.equals(str4));
	System.out.println(str3==str4);
// Create a empty string.	
     String reverse = "";
// Accept string from user using scanner class.    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string to reverse:");
     String original = sc.nextLine();

// Find the length of entered string using length() method of String class.	
     int length = original.length();
     for(int i = length - 1; i >= 0; i--)
	reverse = reverse + original.charAt(i);
	System.out.println("Reversed string: "+reverse);
   }
}


/*
public class ReverseString {
public static void main(String[] args) 
{   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a string to reverse:");
   String original = sc.nextLine();

// Create a StringBuilder object and pass the original variable as parameter.	
     StringBuilder sb = new StringBuilder(original);
      sb.reverse(); // calling reverse method of StringBilder class.
    System.out.println("Reversed string: " +sb);
	}
}
*/