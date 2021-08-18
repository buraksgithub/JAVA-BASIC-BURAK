package com.neotech.lesson21;

public class A {

	//Write program for multilevel inheritance where class A 
	//inherited by B and class B inherited by class by C.
	int num;
	String player;
	
	
    void printF()  { System.out.println( player+ " plays with number  "+ num);}
	
	}
	

    class B extends A{ 
    	
    	//Write program to inherit class A that has method printF 
    	//which is static and call or reuse that method into class B
    	
    	public static void main(String[] args) {
			
    	
    		B term = new B();
    		
    		term.printF();
    		
		}
    	
    }

	
		
	class C extends B{     }
		
		

	
	

