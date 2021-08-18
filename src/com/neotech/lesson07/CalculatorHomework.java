package com.neotech.lesson07;

import java.util.Scanner;

public class CalculatorHomework {

	public static void main(String[] args) {
		//Using scanner class to create a calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your first number!");
		double num1= input.nextInt();
		
		System.out.println("Please enter your second number!");
		double num2= input.nextInt();
		
		System.out.println("Please enter your operator(+,-,*,/)");
		char value= input.next().charAt(0);
		
		switch(value) {
		
		case '+':
			System.out.println("The result will be "+ (num1+num2));	
			break;
		case '-':	
			System.out.println("The result will be "+ (num1-num2));	
			break;
		
		case '*':	
			System.out.println("The result will be "+ (num1*num2));	
			break;
		case '/':	
			System.out.println("The result will be "+ (num1/num2));	
			break;
			
		default:
			System.out.println("Not Acceptible");
			break;
			
		}
		
		
		
	
				
				
		
		
		
	}

}
