package com.neotech.lesson25;

public interface Shape {

	void calculateArea(double a);
	void calculatePerimeter(double b);
	
	
}

class Circle implements Shape{

	@Override
	public void calculateArea(double a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter(double b) {
		// TODO Auto-generated method stub
		
	}

	
	
	
		
	
	
}


	
class Square implements Shape{

	@Override
	public void calculateArea(double a) {   System.out.println(a*a);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter(double b) {System.out.println(4*b);
		// TODO Auto-generated method stub
		
	}
	
}