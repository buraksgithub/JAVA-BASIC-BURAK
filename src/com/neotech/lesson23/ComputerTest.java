package com.neotech.lesson23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer obj1= new Apple(1000);
		obj1.wallet();
		
		Computer obj2= new Lenovo(850);
		obj2.wallet();
		
		Computer obj3= new HP(500);
		obj3.wallet();
		
		Computer obj4= new Dell(150);
		obj4.wallet();
		
	}

}


