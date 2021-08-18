package com.neotech.lesson19;

public class AccessModifiers {
// creating array method
  
	
	
	int method( int[]array) {
		 
	int sum=0;
	
	
	for (int i=0; i<array.length; i++) {
			 
			 sum= sum+array[i];
		 }
	return sum;
}
	
	
	public static void main(String[] args) {
		
		
		
		int []ooo= { 1,2,3,4};
		
		AccessModifiers obj= new AccessModifiers();
		
		System.out.println(obj.method(ooo));

	}

}
