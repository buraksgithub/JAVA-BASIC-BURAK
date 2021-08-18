package com.neotech.lesson08;

public class task1 {
	
	public static void main(String[] args) {
		
		//1. Print numbers from 1 to 100 in 1 line with space
		//Print numbers from 100 to 1
		//Print even numbers from 20 to 1 (2 ways)
		//Print odd numbers between 20 and 50 (2 ways)
		
		for(int i=1; i<100;i++ ) {
			
			System.out.println(i+"");
		}
		
		
	System.out.println("---------------");
	
	for( int b=100; b>1; b--) {
		
		System.out.println(b);
	}
		
	for(int c=20; c>1; c-=2) {
		System.out.println(c);
	}
	
	
	
	for(int d=20; d<50; d=d+2 ) {
		
		System.out.println(d);
	}
		}

}
