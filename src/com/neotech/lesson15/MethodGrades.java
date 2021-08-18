package com.neotech.lesson15;

public class MethodGrades {
	//Create a class Student that will have a method getGrade.
			//Your method should accept the score of a student and return a grade:
				//score > 90 - A
				//score > 80 - B
				//score > 70 - C
				//score > 50 - D
				//anything else - F
	
	 int student(int total) { if(total>=50) { 
			
			
		    
			if(total>=90) {System.out.println("A, Great job!"); }
	    
	    		else if(total>=80) {System.out.println("B, Well done!");}
	    		
	    		else if(total>=70) {System.out.println("C, Average!");}
			
	    		else {System.out.println("D, You passed"); }
		
		 	}
		
	
		else { System.out.println("F, You failed.");}
		
	 return total;
		}
	
	public static void main(String[] args) {
		

		MethodGrades object= new MethodGrades();
		
		
		int a= object.student(85);
		
	
		
	}

}
