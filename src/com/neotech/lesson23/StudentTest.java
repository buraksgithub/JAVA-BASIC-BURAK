package com.neotech.lesson23;

public class StudentTest {

	public static void main(String[] args) {
		
		Student obj= new Student();
		
		
		
		Student obj1= new NeotechStudent();
		Student obj2= new CollageStudent();
		Student obj3= new SchoolStudent();
		
		
		obj.study();
		obj1.study();
		obj2.study();
		obj3.study();
		
	}

}
