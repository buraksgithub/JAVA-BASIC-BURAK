package com.neotech.lesson08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	// Write a program that the user to declare a positive integer.
		//It should then print the multiplication table of that number.

		Scanner input= new Scanner(System.in);
		
		System.out.println("Please write a positive number!");
		
		int num=input.nextInt();
		
		while (num>=0) {
			
			num= num*1;
			num++;
		}
		
		
	}

}
