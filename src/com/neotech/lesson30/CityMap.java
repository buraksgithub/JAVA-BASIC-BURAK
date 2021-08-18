package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CityMap {

	public static void main(String[] args) {
		// Create a Map from array of cities that will sort keys in alphabetical order. As a key
		//store the name of the city and as a value store the length of the city
		//(Example: Paris=5, Moscow =6, Washington DC=13 etc..).
		//-	If any city name is more than 7 characters remove that city .
		
		
		
		
		Map<String, Integer> city= new TreeMap<>();
		
		city.put("Paris", 5);
		city.put("Moskow", 6);
		city.put("Washington DC", 13);
		
		Set<Entry<String,Integer>> names= city.entrySet();
		
		System.out.println(names);
		
		
		
		
		Iterator<Entry<String,Integer>> it= names.iterator();
		
		while(it.hasNext()) {      Entry<String, Integer> world= it.next(); 
			
			
		if (world.getValue()>7) {  it.remove();}  }
		
		
		
		System.out.println(names);
			
			
			
			
				
				
				
		
		
		
		
	}

}