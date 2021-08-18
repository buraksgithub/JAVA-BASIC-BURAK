package com.neotech.lesson21;

public class TeacherHomework {

	public static void main(String[] args) {
		
		Teacher main=new Teacher();
		
		main.name= "John";
		main.age=60;
		main.main();
		
		MathTeacher obj= new MathTeacher();
		
		obj.age=30;
		obj.name= "Osman";
		obj.calculate();

		ChemistryTeacher obj2= new ChemistryTeacher();
		
		obj2.el="Elements";
		obj2.com="Compounds";
		obj2.explain();
		
		
		PianoTeacher obj3=new PianoTeacher();
		
		obj3.sound="musician";
		obj3.plays();
		
		
	}

}
