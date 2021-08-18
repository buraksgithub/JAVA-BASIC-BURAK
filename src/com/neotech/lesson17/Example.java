package com.neotech.lesson17;

public class Example {

	public static void main(String[] args) {
		
		String str= "Today is Saturday and we have a java class";
		
		String[]strarray=str.split(" ");
		
		
		
		
		
		
		for (String el:strarray) {
			
			for (int i=el.length()-1; i>=0; i--) {
				
				System.out.print(el.charAt(i));
			}
			
			System.out.print(" ");
		}
		
		

	}

}
