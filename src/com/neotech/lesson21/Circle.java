package com.neotech.lesson21;

public class Circle extends Shape {

	int radius=3;

	
	Circle (int radius) {
		super(radius);
		
	this.radius=radius;
	
	}

	//void term() { System.out.println("jsahdkj");}
	    
	   int area(int num ) {
		
		int sum=0;
		
		sum= num * (radius * radius);

	    
		return sum;}

	
	
	
	
	
	
	public static void main(String[] args) {
		 Circle obj= new Circle(4);
		
		
		 obj.area(3);
		 
	}

}
