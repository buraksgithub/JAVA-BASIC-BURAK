package com.neotech.lesson23;

public class Creditcard {

	//Create a class CreditCard and define variable balance and interest. 
	//Create an instance method that will calculate interest based on the given balance.
	
	double balance, interest;
	
	
	public Creditcard(double balance){
		this.balance = balance;}
		
		
	public void CalculateInterest() {	
		
		interest = 25;
		System.out.println("The interest rate is "+ interest + "%");     }
	
	}



    class Visa extends Creditcard{

	public Visa(double balance) {
		super(balance);
		
	}
	
	public void CalculateInterest() {	
		
		if (balance>10000) {interest=15;}
		
		else { interest=30;}
	
		
		System.out.println("The interest rate is "+ interest + "%");     }
	
	
	}
	
	
    class AX extends Creditcard {

	public AX(double balance) {
		super(balance);  }
	
	public void CalculateInterest() {  
		
		if ( balance>5000) { interest=10;}
		else { interest=20;}
		
		System.out.println("The interest rate is "+ interest + "%");      }
	
	
}
