package com.neotech.lesson05;

public class Quiz {

	public static void main(String[] args) {
		//§ Write a Java program to check if a student has done the Quiz. 
		//If the student did the Quiz, then check the score and give the following evaluations:
			//o If the score is 90 or greater, print “A, Great job!”.
			//o If the score is 80 or greater, print “B, Well done!”. 
		    //o If the score is 70 or greater, print “C, You passed!”. 
		    //o Otherwise, print “F, You failed”.
		
		int total=95;
		
		
		
		
		if(total>=70) { 
			
			
	    
			if(total>=90) {System.out.println("A, Great job!"); }
	    
	    		else if(total>=80) {System.out.println("B, Well done!");}
	    
	    		else {System.out.println("C, You passed"); }
		
		 	}
		
	
		else { System.out.println("F, You failed.");}
		
		}

}
