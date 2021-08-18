package com.neotech.lesson30;

import java.util.ArrayList;
import java.util.List;

public class SumCollectionHW {

	public static void main(String[] args) {
		// Create a collection of integers in which you can keep duplicates. 
		 //   Write a logic to find sum of all integers
		
		
		// Create a collection of integers in which you can keep duplicates. 
		List<Integer> numbers= new ArrayList<Integer>();
		
		
		numbers.add(10);
		numbers.add(10);
		numbers.add(30);
		numbers.add(50);
		
		
		System.out.println(numbers);
	    
	//   Write a logic to find sum of all integers
		int sum=0;
		
		for(Integer num:numbers) {
			
			sum= sum+num;	}
		
		System.out.println(sum);

		
		
		
}
}