package com.neotech.lesson20;

public class ConstractorAccess {
	 

	
	// Write a program that will have 4 different access levels of constructors and create 3 objects of this class: 
	//1 -inside same class; 
	//2 -from outside the class; 
	//3 -from different class inside different package and observe result.
	
	
	//1 -inside same class; 
	
	public String model;
	public int year;
	
	public ConstractorAccess(String mdl,int yr){
		
	  model=mdl;
	  year=yr;  }
	
	
	
	public void display() {
		
		System.out.println(year+" "+ model+ " is the fastest car!");}
	
	
	
	
	public static void main(String[] args) {


		int power=100;  //
		int tork=2000;  //
		
		//1 -inside same class; 
		
		ConstractorAccess obj1= new ConstractorAccess("Tesla",2020);  
		ConstractorAccess obj2= new ConstractorAccess("VOLVO",2021);
		ConstractorAccess obj3= new ConstractorAccess("KARMA",2022);
		
		
		obj1.display();
		
		
		
		
		
				
	
		
		
		
		
		
		
		
	}
		
		
	
		
		
		
		
		
		
		
		
		
	}


