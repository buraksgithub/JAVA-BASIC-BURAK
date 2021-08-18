package com.neotech.lesson12;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.

	String[] country = { "Turkey","Albania", "USA" };

		for(String capital:country) {
			
			if (capital.equals("Turkey")) { System.out.println("Ankara");}
			
			else if (capital.equals("Albania")) { System.out.println("Tirana");}
			
			else { System.out.println("Washington");
			
			}
			}
		
		

	}

}
