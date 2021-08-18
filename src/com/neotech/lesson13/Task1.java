package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {
//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
//2.Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
//Develop a program which will identify/print the even numbers only.

	
	int[][] numbers= {{10,20,30,40}, {5,6}};
	
	for(int i=0; i< numbers.length; i++) {
		
		for(int j=0; j <numbers[i].length; j++) {
			
			
			if(numbers[i][j]%2==0) {
					System.out.print(numbers[i][j]+" ");}
		
		}
		System.out.println();
		
		
		
		
		
	}

	}
}
