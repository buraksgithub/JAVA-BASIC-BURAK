package com.neotech.lesson14;

public class PhoneObject {

	public static void main(String[] args) {
		
		
		PhoneHomework iphone= new PhoneHomework();
		
		iphone.brand= "Apple";
		iphone.model="iphone X";
		iphone.year= 2020;
		
		iphone.work();
		iphone.quality();
		
		
		PhoneHomework android= new PhoneHomework();
		
		android.brand= "Samsung";
		android.model=" A 10";
		android.year= 2015;
		
		android.work();
		android.quality();
		
		PhoneHomework nokia= new PhoneHomework();
		
		nokia.brand= "Nokia";
		nokia.model="3210";
		nokia.year= 2009;
		
		nokia.work();
		nokia.quality();
		
		//Create a Class “Phone”. 
		//Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	}

}
