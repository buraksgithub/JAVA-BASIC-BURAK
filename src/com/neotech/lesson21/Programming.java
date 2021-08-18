package com.neotech.lesson21;

public class Programming {

	//Create a class named 'Programming'. 
	//While creating an object of the class, if nothing is passed to it, 
	//then the message "I love programming languages" should be printed. 
	//If some String is passed to it, then in place of "programming languages" the value variable should be
	// printed. Example, if we pass "Java", then "I love Java" should be printed.
	
	
	Programming(){
	}
		
	String program;
	
	Programming(String program){
		
		this.program =program;
		
	}
	
	void displayInfo() { System.out.println("I love programming languages");}
	
	void displayInfo2() { System.out.println("I love "+ program);}
	
	
	public static void main(String[] args) {

		Programming obj= new Programming();
	
		obj.displayInfo();
		
		Programming obj2= new Programming("Java");
		
		obj2.displayInfo2();
		
	}

}
