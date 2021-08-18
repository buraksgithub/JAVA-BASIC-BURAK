package com.neotech.lesson17;

public class SundayReverseHomework {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday -> yadnuS). 
	    //Solve it using charAt(), toCharArray()  and reverse() methods.
	    //Note:for charAt() and toCharArray() use String
	        
		String num="Sunday";
		
		char[]ten= num.toCharArray();
		
		for(int i=ten.length-1; i>=0; i--) {System.out.print(ten[i]);}
		
		System.out.println();
		
		
	
		//for reverse you have to declare a StringBuffer object

		
		StringBuffer day=new StringBuffer("Sunday");
		
		day.reverse();
		
		System.out.println(day);
		
	}

}
