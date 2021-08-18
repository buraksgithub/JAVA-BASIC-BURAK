package com.neotech.lesson18;

public class Employee {

	
	//Create a Class called Employee:
		//▪ Create three variables eID , salary and set the CEO to Elion”
		//▪ Create two objects of the class Employee
		//▪ Set the value of eID, salary for each of the objects
		//▪ Print out the eID , salary and CEO for each of the objects

	
	int eID;        /// hepsi farkli ID
	int salary;
	
	static String CEO= "Elion"; //hepsi ayni CEO
	
	
	void info() {System.out.println("Employee ID: "+eID+ " salary "+ salary+ " with CEO is "+ CEO);}
	
	
	
	public static void main(String[] args) {
	
		Employee John= new Employee();
		Employee Snow= new Employee();
		
		John.salary= 10;
		Snow.salary=20;
		
		John.eID= 1;
		Snow.eID=2;
		
		
		
	John.info();
	Snow.info();	

	}

}
