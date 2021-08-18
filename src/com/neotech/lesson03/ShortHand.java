package com.neotech.lesson03;

public class ShortHand {

	public static void main(String[] args) {
		//Declare variable and increase by 100 using shorthand operator
		
		int num=500;
		num= num+100;
		
		System.out.println("variable will increase 100 for each time");
		
		//II. Declare variable and decrease by 67 using shorthand operator
		
		int num2=500;
		num2= num2-67;
		
		System.out.println("Variable will decrase 67 for each time");
		
		
		
		
	//III. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator. PS:*each person should get an equal piece ofcakeIV. 
		
		int cakepiece;
		
		cakepiece=11;
		
		int each= cakepiece/4;
		
		int rem;
		
		rem= cakepiece %each;
	
		
		System.out.println("Each person will get "+ each+ " cakepieces and " +rem+ " will be leftover.");
		
		
		
		//Declare variable cakePiece=25 and divide cakePiece between 7 people.Using shorthand operator found out how many pieces of cake left after itwas distributed equally among 7 people

	}

}
