package com.neotech.lesson05;

public class Alergies {

	public static void main(String[] args) {
		//Write a java program to check if a patient has allergies. 
		
		
		//If the patient does not have allergies print “You’re healthy!”. 
		//If the patient has allergies, check if it is a peanut allergy, 
		//lactose allergy, bee allergy or seafood allergy and 
		
		
		//print a statement telling the patient “Don’t eat ___”. 
		//(fill the line with the food names – peanut, seafood etc.)
		
		
		
		boolean alergies= true;
		
		boolean peanut= true;
		boolean lactose=false;
		boolean seafood=true;
		boolean bee=true;
		
	if(alergies) {
		
		if(seafood) {System.out.println("Do not eat seafood");}
		
		if(lactose) {System.out.println("Do not drink milk");}
		
		if(peanut){System.out.println("Do not eat peanut");}
		
		if(bee){System.out.println("Do not eat honey");}
		
		
		
	}
		
	else {System.out.println("You are healthy!");}
		
	}

}
