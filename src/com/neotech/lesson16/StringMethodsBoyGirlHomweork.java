package com.neotech.lesson16;

import java.util.Scanner;

public class StringMethodsBoyGirlHomweork {

	public static void main(String[] args) {
		// Write a program that reads two parent's first names and if they expecting boy
		// or girl?
		// Based on the input suggests a name for a baby:
		// If it is a boy get half from dad and half from mom.
		// If it is a girl get half from mom and half from dad.

		// Example Output:
		// Mom's first name? Mary
		// Dad's first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY
		// Example Output:
		// Mom's first name? Mary
		// Dad's first name? Daniel
		// Boy or Girl? girl
		// Suggested baby name: MAIEL
		
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("what is mom's first name?");
		
		String mname= input.next();
		
		
		System.out.println("What is dad's first name?");
		
		String dname= input.next();
		
	    System.out.println("boy or girl?");
	    
	    String gender=input.next();
	    
	    
	    String boymom=mname.substring(2, 4);
	    String boydad=dname.substring(0,3);
	    
	    String girlmom=mname.substring(0, 2);
	    String girldad=dname.substring(3, 6);
	    
	    
	    if (gender.equalsIgnoreCase("boy")) {
	    	
	    String babyboy= boydad+boymom;	
	    	
	     System.out.println("Suggested baby name is: "+babyboy.toUpperCase());}
	    
	    
	    
	    else if(gender.equalsIgnoreCase("girl")) {
	    	
	    	String babygirl=girlmom+girldad;
	    	
	    	System.out.println("Suggested baby name is: "+babygirl.toUpperCase());}
		
		
	}

}
