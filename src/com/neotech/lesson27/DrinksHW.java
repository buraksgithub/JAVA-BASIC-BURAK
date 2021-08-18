package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class DrinksHW {

	public static void main(String[] args) {
		//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
		
		
		ArrayList <String> drinks= new ArrayList<>();
		
		drinks.add("Coke");
		drinks.add("Fanta");
		drinks.add("Milk");
		
		
		//if(it.next().contains('a') ) {System.out.println("water");}
			
		
		
		for (String drink:drinks) {
			
			if(drink.contains("a") || drink.contains("e")) {
				
				drink="water";   }
			
			System.out.println(drink);
			
		}
		
		System.out.println(drinks);
		
	}
	
}
			
			
			
		
		
		
		
	
	
	

