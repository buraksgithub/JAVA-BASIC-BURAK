package com.neotech.lesson21;

public class Teacher {

	String name;
	int age;
	
	
	void main() { System.out.println("Our teacher name is "+ name +" and "+ age + " years old!");}
	//Write a Java program called Teacher. Identify features and 
	//behaviour of that Class. Create 3 subclasses MathTeacher, 
	//ChemistryTeacher and PianoTeacher that would have it their 
	//own features and behaviour. Test all 4 classes. 
	
	
 }
	class MathTeacher extends Teacher{
		
		void calculate(){System.out.println("Our MathTeacher "+name+ " is "+ age+ " years old and "+ " Calculates fast!");}
	}
	
	
	class ChemistryTeacher extends Teacher{
		
		String el;
		String com;
		
		
			void explain(){System.out.println("Our Chemistry Teacher knows all "+ el + " and " + com);}
	}
	
	
	class  PianoTeacher extends Teacher {
		
		String sound;
		
		void plays(){System.out.println("Our Piano Teacher plays piano like a " + sound);}
		
		
	public static void main(String[] args) {
		
		
		
		
		
	}

}
