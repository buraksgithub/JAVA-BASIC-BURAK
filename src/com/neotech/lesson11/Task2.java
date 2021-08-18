package com.neotech.lesson11;

public class Task2 {

	public static void main(String[] args) {
	//	Create an array of words: Java, Saturday, day, coding, is.
	//	Print the following sentence using elements of array:
	//	“Saturday is Java coding Day”.
		
		
		String[]word=new String[6];
		
		word[1]= "Java";
		word[2]= "Saturday";
		word[3]= "Day";
		word[4]= "coding";
		word[5]= "is";
		
		System.out.println(word[2]+" " +word[5]+" "+word[1]+" "+word[4]+" "+word[3]);
								

	}

}
