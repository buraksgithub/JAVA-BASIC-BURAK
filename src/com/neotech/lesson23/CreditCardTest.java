package com.neotech.lesson23;

public class CreditCardTest {

	public static void main(String[] args) {
		Creditcard cc1= new Creditcard(12000);
	    cc1.CalculateInterest();
	
	    Creditcard cc2= new Visa(12000);
	    cc2.CalculateInterest();
	    
	    
	    Creditcard cc3= new AX(12000);
	    cc3.CalculateInterest();
	    
	    
	    
	    
	}

}
