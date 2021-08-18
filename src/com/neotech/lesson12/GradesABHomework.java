package com.neotech.lesson12;

public class GradesABHomework {

public static void main(String[] args) {
// Create a 2D array that 
//first row will contain 4 names and second row will contain grades, all Strings.
// Then you program should print name of the students that has A and B grade

	String[][] exam= {{"John","Martin","David","Steve"},{"A","B"}};
	

if(exam[0][1].equals("A")) {System.out.println(exam[0][1]);}
else if	(exam[0][2].equals("B")) {System.out.println(exam[0][2]);}
else if (exam[0][3].equals("B")) {System.out.println(exam[0][3]);}
else if (exam[0][3].equals("A")) {System.out.println(exam[0][3]);}

}


		
		
	}


