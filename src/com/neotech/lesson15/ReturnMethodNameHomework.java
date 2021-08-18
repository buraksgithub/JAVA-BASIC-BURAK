package com.neotech.lesson15;

import java.util.Scanner;

public class ReturnMethodNameHomework {

	// Create a method createEmail(). Based on provided users firstName, lastName
	// and emailType, your method should return complete email address.
	// Example:
	// firstName -> john
	// lastName -> snow
	// emailType -> gmail
	// return -> johnsnow@gmail.com

	String createEmail(String info) {

		switch (info) {

		case "firstName":
			System.out.print("john");

			break;

		case "lastName":
			System.out.print("snow");

			break;

		case "emailType":
			System.out.print("@gmail.com");

			break;
		}

		return info;

	}

	public static void main(String[] args) {

		ReturnMethodNameHomework object = new ReturnMethodNameHomework();

		
		
		
		String a = object.createEmail("firstName");
		String b = object.createEmail("lastName");
		String c = object.createEmail("emailType");

	}

}
