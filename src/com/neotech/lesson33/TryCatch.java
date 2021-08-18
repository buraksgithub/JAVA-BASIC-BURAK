package com.neotech.lesson33;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		//How would handle InputMismatchException?
		//Input Mismatch Exception when user enters mismatch value then programmer expected.
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please write your age!");
		
	
		
		try {  int num= input.nextInt();  }
		
		
		
		catch(Exception e){ 
			
			System.out.println(e);
			
		}
		
System.out.println("Please try a valid number!");
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
			}


