package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntryEmployeeHW {

	public static void main(String[] args) {

		
//Create a Map that will store Employee name and salary. 
//Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
//- John Smith=$100000
		
		Map<String, Integer> work= new LinkedHashMap<>();
		
		work.put("Bergkamp", 300);
		work.put("Henry", 200);
		work.put("Adams", 100);
		
		System.out.println(work);
		
		
		
		Entry<String, Integer> largest= null;
		
		
		for(Entry<String, Integer> team : work.entrySet()) {
			
			
		if( largest == null || team.getValue()>largest.getValue()) { largest=team;}   }
		
		
		System.out.println(largest.getKey()+ "=$"+ largest.getValue());
			
			
		
		
		
		
		
		
		
	
		}
		
		
		
		
	}


