package com.neotech.lesson16;

public class StringMethodsAlphaCharHomework {

	public static void main(String[] args) {
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String. (alpha characters means letters)
		
		
		
		
		String weather= "Today weather will be 90 F@#####";
		
		
		String newweather= weather.replaceAll("[^a-zA-Z]","");

		System.out.println(newweather.length());
		
		System.out.println(newweather);
		
		
		
	
	}

}
