package com.neotech.lesson28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCountriesHomework {

	public static void main(String[] args) {
		//Create a Set collection in which you need to add names of the countries. 
		//In this set we want all objects to be sorted in alphabetical order. 
		//Using 2 different ways retrieve all elements from set.
				
				
				Set<String> countries= new TreeSet<>();
				
				countries.add("USA");
				countries.add("Turkey");
				countries.add("Albania");
				
				
				//First Way
				System.out.println(countries);
				
				//  Second Way
				
				Iterator<String> it= countries.iterator();
				while(it.hasNext()) {
					
					System.out.println(it.next());
				}
				

			}

}
