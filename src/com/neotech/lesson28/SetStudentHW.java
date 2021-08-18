package com.neotech.lesson28;

import java.util.HashSet;
import java.util.Set;

public class SetStudentHW {

	String name;
	int ID;
	

	SetStudentHW(String name, int ID){
		
		this.name=name;
		this.ID=ID;}
	
	
	void StudentType() {
		
		System.out.println("This student name is: " +name+ " and his ID is "+ ID);
	}
	
	public static void main(String[] args) {
		 //Create a Set collection that will hold Objects of Student Type. 
		//In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. Display name of each student.
		
		
		Set<SetStudentHW> students= new HashSet<>();
		
	    students.add(new SetStudentHW("John", 12) );
	    students.add(new SetStudentHW("Steve", 56) );
	    students.add(new SetStudentHW("Eric", 78) );
		
		
	  for(SetStudentHW st: students) {
		  
		  st.StudentType();
	  }
	    
	    
	}



	

}
