package com.neotech.lesson19;

public class Example2 {

	//Create a method that will take a String as a parameter and returns reversed String.
			//Method should be available to all classes within your project and accessible by class name.

	
	
	String name( String num) {
		
		String kon ="";
		
		for (int i= num.length()-1; i>=0; i--) { kon+=num.charAt(i);}
		
		return kon;
	}

	
	
	
	public static void main(String[] args) {
		
		
		String man="Manchester";
		
		
		Example2 obj= new Example2();
		
		System.out.println(obj.name(man));
		
		
		
	}

}
