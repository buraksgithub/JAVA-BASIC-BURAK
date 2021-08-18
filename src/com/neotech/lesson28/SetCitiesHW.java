package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCitiesHW {

	public static void main(String[] args) {
		  //Create a Set of cities in which you want to make sure that insertion order is maintained. 
		  //Using Iterator remove any city that starts with “A”;
		
		Set<String> cities= new LinkedHashSet<>();
		
		cities.add("NY");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Ankara");
		
		
		System.out.println(cities);
		
		
		Iterator<String> it= cities.iterator();
		
		while(it.hasNext()) {
			
			String city= it.next();
			
			if (city.startsWith("A")) { it.remove();}
			
			
			System.out.println(cities);
			
		}
		
	
	}

}
