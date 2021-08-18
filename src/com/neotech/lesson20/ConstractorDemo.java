package com.neotech.lesson20;

public class ConstractorDemo {

	
	 public String brand;
	 public String fueltype;
	
	
	public ConstractorDemo(String br, String fl){
		
		
		
		brand=br;
		fueltype=fl;
	}
	
  //  public void display2() {
		
	//	System.out.println(brand+" "+fueltype+ " is the fastest car!"+power);}
	

public static void main(String[] args) {
		
	//2 -from different class test
	
	
	ConstractorAccess obj2= new ConstractorAccess("VOLVO",2021);
	obj2.display();
	
	}

}
