package com.neotech.lesson08;

import java.util.Scanner;

public class Userpassword {

	public static void main(String[] args) {
		
		// Write a program that asks user to enter his/her username 
		//and password until user enters them correctly.
		
		Scanner input= new Scanner(System.in);
		
		
       System.out.println("Please enter your username! ");
       String username= input.next();
       
       do { 
    	   System.out.println("Enter your password!");
    	   String password=input.next();
       
       } while(username.equals("sifre"));
    	   
    	   
       }
     
	

	}


