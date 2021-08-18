package com.neotech.lesson08;

public class WhileLoopEven {

	public static void main(String[] args) {
//Write a program using while loop, 
//that calculates the sum of the even numbers between 0 and 10.

		int even=0;
		int total=0;
		
		while(even<=10) {
			
			if (even%2==0) { 
				total=total+even;
				}
			
			even++;
			}
		
		System.out.println("total="+total);
			
			
			
		
		
		
		
		
		
		
	}

}
