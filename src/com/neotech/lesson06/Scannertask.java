package com.neotech.lesson06;

import java.util.Scanner;

public class Scannertask {

	public static void main(String[] args) {
//1. Write a program that asks user to enter first name and then last name. 
		//At the end system should display user’s full name.

Scanner input= new Scanner(System.in);	

System.out.println("Please enter your name!");
String name=input.next();

System.out.println("Please enter your lastname!");
String lastname=input.next();


System.out.println("Your full name is "+ name+ " " +lastname);
		
		
//2. Write a program that calculates the sum of two numbers entered by the user.


System.out.println("Please enter your number1 ");
int number1=input.nextInt();


System.out.println("Please enter your number2");
int number2=input.nextInt();


System.out.println("Your numbers sum is:"+(number1+number2));







//3. Write a program that asks user to enter two numbers and prints which one is larger.

	


		
		
	}

}
