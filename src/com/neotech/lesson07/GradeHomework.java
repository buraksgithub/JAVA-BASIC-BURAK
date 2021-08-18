package com.neotech.lesson07;

import java.util.Scanner;

public class GradeHomework {

	public static void main(String[] args) {
//Allow user to enter grade and then provide explanation:
//A-Excellent, B-Good, C-Average, D-Bad, 
//any other grade --> Not Acceptable. 
//At the end your program should print which grade was entered by a user with explanation.
		
   Scanner grade= new Scanner(System.in);
   
   System.out.println("Please enter your grade (A,B,C,D)");
   
   char value= grade.next().charAt(0);
   
   
   
  if(value=='A') { 
	  
	  System.out.println("You are excellent!");}
	  
	  else if (value =='B') {
		  
		  System.out.println("You are good!");}
	  
	  else if(value=='C') {
		  
		 System.out.println("You are average!");}
	  
	  else if(value=='D') {
		  
		  System.out.println("You are bad!");}
  
	  else {
		  System.out.println("Not Acceptable");
		  
  
 
  
  
	  }
  
   
   
		
		
		
		
		
		
		
		
		
	}

}
