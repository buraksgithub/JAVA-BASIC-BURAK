package com.neotech.lesson17;

public class Split {

	public static void main(String[] args) {
		String sentence = "Today is Thursday and I have Java class";
	
		String[] array = sentence.split("d");
	    
		for (String str : array) {System.out.println(str);
		}
	
		
		
		// reverse the sentence
				// class|Java|have|I|and|Thursday|is|Today
	
		
		
		
		
		
		// Find out how many sentences are there in the string
		// "Yay! It is Saturday. Is it raining? Take your umbrella.
		
		
		
		
		
		//   split" \\. " or  split("[.!?]")
		
		
		String sentenc= "Yay! It is Saturday. Is it raining? Take your umbrella.";
		
		String []arrayy = sentenc.split("[.!?]");
		
		for(int i=0; i<arrayy.length; i++) {System.out.println(arrayy[i]);}
		
		System.out.println(arrayy.length);
		
		
		
		
	}

}
