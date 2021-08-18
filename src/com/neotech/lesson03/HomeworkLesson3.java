package com.neotech.lesson03;

public class HomeworkLesson3 {

	public static void main(String[] args) {
		
		// Write a Java program that will print a sum of two numbers Please use
				// variables to store num1,num2,and sum Sample output:46 + 90 = 136
		
		int num1, num2;
		
		num1= 46;
		num2=90;
		
		int sum;
		sum= num1+num2;
		
		System.out.println(sum);
		
		//Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32 
		
		double F,C;
		F=40;
		C= (F-32)*5/9;
		
		System.out.println("40 Fahrenheit is equal to " +C+ " Celcius.");
		
		
		//Write a Java program that converts mile to km 1 mile = 1.609344 km
		
		double M=1.609344;
		double KM= 1;
		
		double convert;
		convert= M*KM;
		
		System.out.println("1 mile equals to " +convert+ " kilometers.");
		
		// Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas: perimeter = 2 * radius * ππ area = radius * radius * ππ
		
		double r,π;
		π=3.14;
		r=5.5;
		
		double perimeter, area;
		perimeter= 2*π*r;
		area= π*r*r;
		
		System.out.println("Perimeter of the circle is " +perimeter+".");
		System.out.println("Area of the the circle is "+ area+".");
		
		// Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula: area = width * height
		
		double w,h;
		w=4.5;
		h=7.9;
		
		double area1;
	    area1= w*h;
	    
	    System.out.println("Area of the rectangle is " +area1+".");
		
	    // Write a Java program that calculates the average of 3 numbers.  Write a program to print the area and perimeter of a rectangle with
		
		int num7,num8,num9;
		
	num7=10;
	num8=20;
	num9=30;
	
	int avrg;
	avrg= (num7+num8+num9)/3;
	
	System.out.println("Average of 3 numbers is " +avrg+".");
		
		
		
		
	
		
  
		
		
		
		
		
		
		
		

	}

}
