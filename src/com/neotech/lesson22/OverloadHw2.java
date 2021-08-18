package com.neotech.lesson22;

public class OverloadHw2 {

	//Create a class with 3 overloaded private methods. 
	//Then call each overloaded methods with specific arguments and observe the results.
	
	private void num(String fen, String gal) { System.out.println(fen+ " always wins "+ gal+ " game");}

	private void num(String fen, String gal, String bes) {System.out.println(fen+ " always wins "+ gal+ " game but draws with "+ bes);}

	private void num(String fen, String gal, String bes, String champ) {System.out.println(fen+ " always wins "+ gal+ " game but draws with "+ bes+" and becames "+ champ);}
	
	
	
	
	public static void main(String[] args) {
		
		OverloadHw2 obj = new OverloadHw2();

		obj.num("fenerbahce", "galatasaray");

		obj.num("fenerbahce", "galatasaray","besiktas");

		obj.num("fenerbahce", "galatasaray","besiktas", "champion");
		
		
	}

}
