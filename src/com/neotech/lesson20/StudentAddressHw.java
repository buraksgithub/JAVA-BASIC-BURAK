package com.neotech.lesson20;

public class StudentAddressHw {
	//Write program as a Student class that has instance variables name and address. 
	//Create a constructor that will initialize those variables. 
	//Print name & address of given student using displayInfo method
	
	String name;
	String address;
	
	StudentAddressHw(String sName, String sAddress){
    
	name=sName;
	address=sAddress;

	}
	
	
	void displayInfo() {
		
		System.out.println("Student name is: "+ name + " and Student address is:" +address);
	}
	
	public static void main(String[] args) {
		
		StudentAddressHw obj= new StudentAddressHw("Burak","Los Angeles");
		
		obj.displayInfo();
		
		
		


	}

}
