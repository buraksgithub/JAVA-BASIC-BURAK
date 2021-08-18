package com.neotech.lesson09;

import java.util.Scanner;

public class Creditcard {

	public static void main(String[] args) {
//Create a program that will be asking user to apply for a credit card 10 times.
// As soon you get an "yes" from a user program should stop asking.

		
		int card=1;
		Scanner input =new Scanner(System.in);
		
		
		while(card<=10) {
	    	
	    	System.out.println("Do you want a credit card!");
	    	String answer= input.next();
	    	if(answer.equalsIgnoreCase("yes")) {
	    		break;}
	    	card++; 
	    	
		}
	    
	    
		
		
		
		
	}

}
