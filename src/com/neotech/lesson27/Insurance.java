package com.neotech.lesson27;

public class Insurance {
	// Create a class Insurance that will have an attribute as insuranceNameand unimplemented behaviouras getQuoteand cancelInsurance. 
			//Create 3 subclasses Car, Pet, Health. Car class has it’sown attribute as carModeland Class Pet has petTypeattribute. 
			//Create 3 objects of the sub classes and store them in ArrayList. 
			//Using for loop/advanced for loop/ iterator access all methods of the class.
	String insuranceName;
	
	
	Insurance (String insuranceName) { this.insuranceName=insuranceName; }
	
	
	void getQuote() {   }
	
	void cancelInsurance() {  }
		
	
}
	
	
	class Car extends Insurance {
		
		
		String carModel;
		Car(String insuranceName, String carModel) {
			
			super(insuranceName); 
			this.carModel=carModel;    }
		
		void getQuote() {  System.out.println("Quote for "+ carModel+ " 1000$"); }
		void cancelInsurance() { System.out.println("Cancelling the Car Insurance"); }
		
	}
		
	
	
	class Pet extends Insurance{
		
		String PetType;
		Pet(String insuranceName, String PetType){
			super(insuranceName);
			this.PetType=PetType;
			
		}
		
		void getQuote() {  System.out.println("Quote for "+ PetType+ " 100$"); }
		void cancelInsurance() { System.out.println("Cancelling the Pet Insurance"); }
			
	}
	
	class Health extends Insurance{
		
		String HealthType;
		
		Health(String insuranceName, String HealthType){
			
			super(insuranceName);
			this.HealthType=HealthType;
			}
		void getQuote() {  System.out.println("Quote for "+ HealthType+ " 500$"); }
		void cancelInsurance() { System.out.println("Cancelling the Health Insurance"); }
		
		
	}
	
	
	
	
	
	
	


