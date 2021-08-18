package com.neotech.lesson07;

import java.util.Scanner;

public class GradeHomework2 {

	public static void main(String[] args) {
//Allow user to enter grade and then provide explanation:
//A-Excellent, B-Good, C-Average, D-Bad, 
//any other grade --> Not Acceptable. 
//At the end your program should print which grade was entered by a user with explanation.
					
  Scanner grade= new Scanner(System.in);
  
  System.out.println("Please enter your grade (A,B,C,D)");
  char value= grade.next().charAt(0);
  
  switch(value) {
  
  case('A'):
	  System.out.println("You are excellent!");
  break;
  
  case ('B'):
      System.out.println("You are good!");
  break;
  
  case ('C'):
      System.out.println("You are average!");
  break;
  
  case ('D'):
      System.out.println("You are bad!");
  break;
  
  default:
	  System.out.println("Not Acceptable");
	  break;
  }


		
		
	
	}

}
