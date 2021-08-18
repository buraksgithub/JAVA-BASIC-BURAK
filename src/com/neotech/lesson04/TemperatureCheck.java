package com.neotech.lesson04;

public class TemperatureCheck {

	public static void main(String[] args) {
		//Create a Java program and name it Temperature Check.
		//Create variable to store temperature.
		//Your program should check if temperature is below 32
		//If temperature is below
		    //then it should print “Water will freeze with temperature __”,
		    //otherwise “Water will NOT freeze with temperature __”.
		
		
		int storetemperature= 50;
		
		
		if (storetemperature<32) {
			System.out.println("Water will freeze temperature" + storetemperature+".");} 
		else { System.out.println("Water will not freeze with temperature "+ storetemperature+".");}
		
		
	}

}
