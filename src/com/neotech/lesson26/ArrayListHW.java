package com.neotech.lesson26;

import java.util.ArrayList;

public class ArrayListHW {

	public static void main(String[] args) {
		//Create an arraylist of cars and retrieve all the values
		//using 2 different (for and enhanced for) ways.
		
		
		ArrayList< String> cars = new ArrayList<>();
		
		
		
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Mercedes");
		
		
		System.out.println(cars.size());
		
		//using for for Loop
		
		
		for (int i=0; i<cars.size(); i++) {
			
		System.out.println(cars.get(i));
		}
		
		
		// using Enhanced Loop
		
		
		for( String obj:cars) {
			
			System.out.println(obj);
			
		}
	}

}
