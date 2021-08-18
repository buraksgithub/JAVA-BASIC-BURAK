package com.neotech.lesson17;

public class TodayIsTuesdayReverseHomework {

	public static void main(String[] args) {
		//Write a program to print out the following conversion:
		    //Today is Tuesday and we have a Java Class!!!  to 
		    //yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
		
		
		
		String num= "Today is Tuesday and we have a Java Class!!! ";
		String[] ayir= num.split(" ");
		
		
		
		
		for(String ters:ayir) {  
			
			
			
			
		for(int i=ters.length()-1; i>=0; i--) {System.out.print(ters.charAt(i));}
			System.out.print(" ");
			
		
		}
		
		
		
	
		
		
		
	
		
		
		
		
	
		
		
	}

}
