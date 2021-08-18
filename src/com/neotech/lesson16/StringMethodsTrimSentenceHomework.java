package com.neotech.lesson16;

public class StringMethodsTrimSentenceHomework {

	public static void main(String[] args) {
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		String sentence="Today is Tuesday";
		
		String newsentence= sentence.replaceAll(" ", "");
		
		System.out.println(newsentence);
		

	}

}
