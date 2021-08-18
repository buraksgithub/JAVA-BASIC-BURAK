package com.neotech.lesson23;

public class Computer {

	
	// Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
	//Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
	//Create objects of child classes and store them into array. Loop through each object and execute available methods.

	
	
	int money;
	
	public Computer(int money){
	this.money=money; 
	
	}
	
	public void wallet() {System.out.println("You need money to buy computer");}  }
	
	
	class Apple extends Computer{
	
		Apple(int money){
			super(money);   
			
		 }
		
		
		public void wallet(){
			
			if (money==1000) {System.out.println("You can buy Macbook");}  
			else {System.out.println("You can not effort Macbook"); }               }
		    
		
		}
	

	class Lenovo extends Computer {
		
		Lenovo(int money){
			super(money);     }
		
		public void wallet(){
			
			if (money>800 && money<1000) {System.out.println("You can buy Lenovo or cheaper computers");}     
			                               }
	
	}
	
class HP extends Computer {
		
		HP(int money){
			super(money);     }
		
		public void wallet(){
				
			if (money>400 && money<800) {System.out.println("You can buy HP or cheaper computers");}     
			                               }
		
	}
	
class Dell extends Computer {
	
	Dell(int money){
		super(money);     }
	
	
	
	public void wallet(){
		
		if (money<300) {System.out.println("You can buy Dell or cheaper computers");}     
		                               }
	
	



}
	

