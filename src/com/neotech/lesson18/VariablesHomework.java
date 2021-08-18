package com.neotech.lesson18;

public class VariablesHomework {

	String studentName;
	int studentID;
	static int numberOfStudents;
	
	
	//void info(int total) { total=obj1+obj2+obj3;
		
	
		
		//System.out.println("Student name is:" +studentName+ "with" +studentID+ "and the total number of student is"+ total);
	//}
	
	public static void main(String[] args) {
		//▪ Create three variables studentName , studentID and numberOfStudents
		//▪ Create three objects of the Students Class
		//▪ Set the value for studentName , studentID and increment the numberOfStudents for each object
	    //▪ Print out total number of students
		
		
		VariablesHomework obj1= new VariablesHomework();
		
		obj1.studentName= "Alex";
		obj1.studentID=10;
		obj1.numberOfStudents++;
		
		VariablesHomework obj2= new VariablesHomework();
		obj2.studentName= "De";
		obj2.studentID=20;
		obj2.numberOfStudents++;
		
		VariablesHomework obj3= new VariablesHomework();
		
		obj3.studentName= "Souza";
		obj3.studentID=30;
		obj3.numberOfStudents++;
	//	obj1.info();
		
		
		
		System.out.println("Total number of students is: "+ numberOfStudents);
	}

}
