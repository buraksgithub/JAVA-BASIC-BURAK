package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerHomework1 {

	public static void main(String[] args) {
		//Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
			//• short (under 60 inch)
			//• medium(between 60 -72 inch) 
			//• tall (over 72 inch)
		
		
		
		Scanner person= new Scanner(System.in);
		System.out.println("Please enter your height!");
		int height= person.nextInt();
		
		if (height>60) {
			
		
		if (height<73) {System.out.println("You are medium height person!");}
		
		else {System.out.println("You are a tall person!");}
			
		}
		
		
		else {System.out.println("You are a short person!");}
		
		
		
		
		
		
		
		
		
		

	}

}
