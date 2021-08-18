package com.neotech.lesson07;

import java.util.Scanner;

public class DaysHomework {

	public static void main(String[] args) {
		// Write a program to display days;
		// 1- Monday
		// 2- Tuesday
		// 3- Wednesday
		// 4- Thursday
		// 5-Friday
		// 6-Saturday
		// 7-Sunday

		Scanner input = new Scanner(System.in);
		System.out.println("Please tell me a number between 1-7 !");
		int day = input.nextInt();

		switch (day) {

		case 1:

			System.out.println("Monday");
			break;
		case 2:

			System.out.println("Tuesday");
			break;
		case 3:

			System.out.println("Wednesday");
			break;
		case 4:

			System.out.println("Thursday");
			break;
		case 5:

			System.out.println("Friday");
			break;
		case 6:

			System.out.println("Saturday");
			break;
		case 7:

			System.out.println("Sunday");
			break;
		default:

			System.out.println("Not Acceptable");
			break;

		}

	}

}
