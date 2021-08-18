package com.neotech.lesson08;

import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
		
// Write a program that asks user to enter his/her username 
//and password until user enters them correctly.
		
		   
	        Scanner input = new Scanner(System.in);
	        
	        
	        String username;
	        String password;
	        
	        do {
	        	
	        System.out.print("Enter username:");
	        username = input.next();
	        
	        }while(!username.equals("isim")); 
	        
	        do {
	        
	        System.out.print("Enter password:");
	        password = input.next(); 
	        
	        
	        } while(!password.equals("sifre")); System.out.println("congrats");
	        
	        
	        
	       }
	}
	

	



