package test101;

import java.util.Map;

/*
 * 1. Equality used(Reference Equality instead of Object Equality) : IdentityHashMap uses reference equality to compare keys and values while HashMap uses object equality to compare keys and values .
for example :

Suppose we have two keys k1 and k2
 */

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    
    public static void main(String[] args) { 
 
           
       // Created HashMap and IdentityHashMap objects

        Map hashmapObject = new HashMap();
        Map identityObject = new IdentityHashMap();
        
        Map identityObject1 = new IdentityHashMap();
        
       
       // Putting  keys and values in HashMap and IdentityHashMap Object

        hashmapObject.put(new String("key") ,"Google"); 
        hashmapObject.put(new String("key") ,"Facebook"); 
       

        identityObject.put(new String("identityKey") ,"Google"); 
        identityObject.put(new String("identityKey") ,"Facebook"); 
        
        identityObject1.put("identityKey" ,"Google"); 
        identityObject1.put("identityKey" ,"Facebook"); 

        // Print HashMap and IdentityHashMap Size : After adding  keys
       
        System.out.println("HashMap after adding key :"+ hashmapObject);   //hashmap compares key buy using .equals()
        System.out.println("IdentityHashMap after adding key :"+ identityObject);  //identityhashmap compares key buy using "=="
        System.out.println("IdentityHashMap after adding key :"+ identityObject1);  //identityhashmap compares key buy using "=="
                           
 }
}
