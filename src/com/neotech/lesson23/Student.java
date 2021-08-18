package com.neotech.lesson23;

public class Student {

   //Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
   // Define common behavior within parent class and override some of the methods in child classes
   //Define some methods specific to child classes
   // Write example of achieving run time polymorphism
	
	
	
	
	public void study() { System.out.println("Students study hard");} }
	
	
	
	class NeotechStudent extends Student {
	
	
	public void study() {  System.out.println("Neotech students study hard");}  }
	
	
	
	
	class CollageStudent extends Student {
		
	public void study() { System.out.println("Collage students study hard");}  }
		
		
		
	
	
   class SchoolStudent extends Student {
	
	public void study() { System.out.println("School students study hard");}  
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	



