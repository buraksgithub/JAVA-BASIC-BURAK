package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
	// Create a class Insurance that will have an attribute as insuranceNameand unimplemented behaviouras getQuoteand cancelInsurance. 
	//Create 3 subclasses Car, Pet, Health. Car class has it’sown attribute as carModeland Class Pet has petTypeattribute. 
	//Create 3 objects of the sub classes and store them in ArrayList. 
	//Using for loop/advanced for loop/ iterator access all methods of the class.
		
	
	
	
	
	public static void main(String[] args) {
		
	

		
		ArrayList<Insurance> Ins= new ArrayList<>();
		
		Ins.add(new Car("AAA", "Toyota"));
		Ins.add(new Pet("Aviva", "Cat"));
		Ins.add(new Health("Cigna", "Family"));
		
		
		
		Iterator<Insurance> it= Ins.iterator();
		
		while(it.hasNext()) {
			
			Insurance kind= it.next();
			kind.getQuote();
			kind.cancelInsurance();
		}
		
		
		
	}

}
