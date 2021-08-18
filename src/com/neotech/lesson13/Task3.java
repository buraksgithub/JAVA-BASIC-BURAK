package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {
		//Task 3. Create a 2D array or integer type and store numbers in 3 rows and 3 columns. 
		//Print the sum of all numbers.
		//Use for loops and enhanced for loops

		int sum=0;
		int[][]numbers= {{12,45,32},{35,54,17},{34,19,76}}; 
		
		for(int i=0; i< numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				sum= sum+numbers[i][j];
				
				}
       }
	
		  System.out.println(sum);
	}

}
