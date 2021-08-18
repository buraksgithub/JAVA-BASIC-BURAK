package com.neotech.lesson10;

import java.util.Scanner;

public class StarPyramidHomework {

	public static void main(String[] args) {
		//Ask the user to enter an integer and build the following pattern:
		//	 *********
		//	  *******
		//	   *****
		//	    ***
		//	     *
		

		Scanner input= new Scanner(System.in);

		System.out.println("Please enter your number!");
		int number= input.nextInt();

		for (int a = 1; a <= number; a++) {

			for (int b = 1; b <= a; b++) {System.out.print(" ");}
			for (int b = a; b < number; b++) {System.out.print("*");}
			for (int b = a; b <= number; b++) {System.out.print("*");}
			
			System.out.println();
		}

	}

}
