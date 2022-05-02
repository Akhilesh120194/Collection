package test101;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p1=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Amiseq\\Desktop\\test.properties");
		p1.load(fis);  //It will load the properties file in to java .
		System.out.println(p1);  //Print the content of file in console 
		String s1=p1.getProperty("username");//it will give the value corresponding to username in test.properties file .
		System.out.println(s1);//the value corresponding to username in test.properties file .
		p1.setProperty("food","Kadhai Chicken");
		System.out.println(p1); // we need to create FOS first 
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Amiseq\\Desktop\\test.properties");
		p1.store(fos, "data has been updated Successfully"); //It will store the newly added food value to properties file 
		System.out.println(p1);
		

	}

}
