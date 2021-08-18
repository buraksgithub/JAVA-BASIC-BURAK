package com.neotech.lesson19;

public class Example {

	
	//Create a method that will accept an array as parameters 
	//and will return a sum of all elements from that array. 
	//Method should be visibly only within same package and accessible by the creating an instance of the class.
	
	
	
	int num ( int[] som) {
		int  result=0;
		for (int el: som) { result=result+el;}
		
		return result;
				
		
		
		
	}
	
	
	public static void main(String[] args) {
		 
		
		int[] bon= { 2,3,6,9};
		
		
		Example obj= new Example();
				
		System.out.println(obj.num(bon));
	}

}
