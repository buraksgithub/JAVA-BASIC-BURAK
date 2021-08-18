package com.neotech.lesson10;

import java.util.Scanner;

public class NumberPyramidHomework {

	public static void main(String[] args) {
		// Ask the user to enter an integer and build the following pattern:

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5

		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your number!");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {

		for (int m = 1; m <= i; m++) {System.out.print(m);}

			System.out.println();

		}

		for (int a = 4; a >= 1; a--) {

		for (int b = 1; b <= a; b++) {System.out.print(b);
			}

			System.out.println();

		}

	}

}
