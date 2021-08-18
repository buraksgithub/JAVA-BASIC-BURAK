package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
	System.out.println("Please enter your name!");
	String name=input.next();
	System.out.println("your name is "+name);
	
	System.out.println("please enter your age");
	int age=input.nextInt();
	System.out.println("your age is;"+ age);
	
	System.out.println("Please enter you age as double!");
	double ageDouble=input.nextDouble();
	System.out.println("your age in double is "+ageDouble);

	}

}
