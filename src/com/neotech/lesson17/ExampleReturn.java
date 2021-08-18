package com.neotech.lesson17;

public class ExampleReturn {

	public static void main(String[] args) {
	
	String str="Today is Saturday and we have Java"	;
		
		ExampleReturn obj= new ExampleReturn();
		String num =obj.reverseString(str);
		System.out.println(num);
		
	}

	
	
	
	String reverseString(String str) {
	
	String resultStr= "";
	
	char[]charArray= str.toCharArray();
	
	for (int i=charArray.length-1; i>=0; i--) { resultStr= resultStr+charArray[i]; } 
	
	return resultStr; }
		
	
	
	
	
	
	
}
