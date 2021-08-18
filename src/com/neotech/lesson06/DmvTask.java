package com.neotech.lesson06;

import java.util.Scanner;

public class DmvTask {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		
//2. You are DMV representative and you need to ask customer their age. 
//If they are 18 and older you will issue a driver licence to them,
//otherwise you will offer them to get a learners permit.
		
		//int age=0;
		
		System.out.println("How old are you?");
		
		int age=input.nextInt();
		
		if(age>=18) { System.out.println("I can issue your drivers license!");
			
		}
		
		else { System.out.println("Please get a learners permit first!");}
		}

			
	}


