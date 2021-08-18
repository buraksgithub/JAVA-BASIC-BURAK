package com.neotech.lesson13;

public class ArrayCountriesHomework {

	public static void main(String[] args) {
//Create an array of countries: north America countries, south America countries, 
//Europe countries, Asian countries, African countries. 
//Then print all values from that array using 2 different loops 
//and calculate how many total countries been stored.
		
	String[][]country= {{"USA","Canada"},{"Mexico","Brazil"},{"Germany","France"},{"Japan","China"},{"Cameroon","Gana"}};
	
	//first way
	for(int i=0; i< country.length; i++) {
	
	for(int j=0; j< country[i].length; j++)  { System.out.print(country[i][j]+" ");
	
	System.out.println();} 
	

	}
	
   //second way
	for ( String[] names:country) {
	
	for(String data:names) {System.out.print(data+" ");}
	System.out.println();}



	}
}
	
	

