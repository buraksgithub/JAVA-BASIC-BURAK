package com.neotech.lesson13;

public class ArrayMaxMinNumberHomework {

	
	//Write a java program to find the second largest number in the array? 
	//Maximum and minimum number in the array?
	
//second largest number
	public static void main(String[] args) {
		
		int[] numbers= { 10,20,100,40,50,60,67,80,3,5,8};
		
		
		int size= numbers.length;
		int secnd= numbers[size-2];
		
		System.out.println(secnd);
		
		
// Maximum number
		
	int largest= numbers[0];
		
		
	for( int i=0; i< numbers.length; i++) {
		
			
	if ( largest<numbers[i]) { 
			
				
		largest=numbers[i];
		
	continue;}
				
		}
		
		System.out.println(largest);
		
// Minimum number
		
		int smallest= numbers[0];
		
		
		for( int i=0; i< numbers.length; i++) {
			
				
		if ( smallest>numbers[i]) { 
				
					
			smallest=numbers[i];}
					
			}
			
			System.out.println(smallest);
	
		}

	}




