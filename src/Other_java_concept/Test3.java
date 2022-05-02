package Other_java_concept;

//Declaring Parent class
class Parent {
 /* Creation of final variable pa of string type i.e 
 the value of this variable is fixed throughout all 
 the derived classes or not overidden*/
 final String pa = "Hello , We are in parent class variable";
}
//Declaring Child class by extending Parent class
class Child extends Parent {
 /* Creation of variable ch of string type i.e 
 the value of this variable is not fixed throughout all 
 the derived classes or overidden*/
 String ch = "Hello , We are in child class variable";
}

class Test3 {
 public static void main(String[] args) {
     // Creation of Parent class object
     Parent p = new Parent();
     // Calling a variable pa by parent object 
     System.out.println(p.pa);
     // Creation of Child class object
     Child c = new Child();

     // Calling a variable ch by Child object 
     System.out.println(c.ch);
     // Calling a variable pa by Child object 
     System.out.println(c.pa);
 }
}