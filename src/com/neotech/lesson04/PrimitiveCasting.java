package com.neotech.lesson04;

public class PrimitiveCasting {
 
	public static void main(String[] args) {
		
		
		
		
		//narrowing
		int number1= 500;
		byte number2 = (byte)number1;
		System.out.println(number2);
		
		//reassigning
		
		number1= number2;
		System.out.println(number2);
		
		//assuming it was 50
		
		int no1 =50;
		byte no2 = (byte) no1;
		System.out.println(no2);
	
		

	}

}
