package com.neotech.lesson22;

public class OverloadHw1 {

	// Create 1 class with 3 overloaded static methods.
	// Then call each overloaded methods with specific arguments and observe the
	// results.

	static void num(int one, int two) { System.out.println(one + two);}

	static void num(int one, int two, int tree) {System.out.println(one + two + tree);}

	static void num(int one, int two, int tree, String fav) {System.out.println(fav+ " numbers are  :" + one +" "+two+ " " +tree);}
	
	
	public static void main(String[] args) {

		OverloadHw1 obj = new OverloadHw1();

		obj.num(10, 20);

		obj.num(5, 9, 8);

		obj.num(3, 5,7, "favorite");
		
		
	}

}
