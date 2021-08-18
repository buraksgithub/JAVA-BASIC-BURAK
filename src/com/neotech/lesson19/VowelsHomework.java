package com.neotech.lesson19;

import com.neotech.lesson20.ConstractorAccess;

public class VowelsHomework {
	
//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
//Method should be available inside the class where it was declared and executed by calling it is name.
 // public String method (String a)

	

 String str( String num) {
	 
	 String name= num.replaceAll("[^aeuioOAEUI]","");
	 
	 return name;
	 
	 
	 
 }
	

public static void main(String[] args) {
	
	
	String num= "Burak";
	
	VowelsHomework obj= new VowelsHomework();
	
	System.out.println(obj.str(num));

	
	
	
	//3 -from different class inside different package and observe result.
	
	ConstractorAccess obj3= new ConstractorAccess("KARMA",2022);
	obj3.display();
	}
	 
	 
	
	
	
}



 
 
 
 

