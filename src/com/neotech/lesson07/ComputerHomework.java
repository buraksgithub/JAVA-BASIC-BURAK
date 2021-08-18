package com.neotech.lesson07;

import java.util.Scanner;

public class ComputerHomework {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//Write a program that lets user to enter apple,dell,acer laptop models
//If it is apple show “Apple-no virus”
//If it is dell show “Tough one”
//If it is acer show “Cheap one”
//Else “do not buy that one!”

		System.out.println("Please enter your computer model! (Apple,Dell,Acer)");
		String com = input.next();

		switch (com) {

		case ("Apple"):

			System.out.println("Apple- no virus");
			break;

		case ("Dell"):

			System.out.println("Tough one");
			break;

		case ("Acer"):

			System.out.println("Cheap one");
			break;

		default:

			System.out.println("Do not buy that one!");
			break;
		}

	}

}
