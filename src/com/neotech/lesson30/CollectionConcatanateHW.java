package com.neotech.lesson30;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionConcatanateHW {

	public static void main(String[] args) {
		 // Create the collection that will store single unique objects of a String type in which order is preserved.
		 // Write a logic to concatenate all string from the collection.
		
		
		//unique objects means= set because no duplicates / lists you can duplicate
		//concatenate means sum actually for strings
		
		ArrayList<String> names= new ArrayList<>();
		
		names.add("Zola");
		names.add("Flo");
		names.add("Babayaro");
		
		
		System.out.println(names);
		
		
		for(String futbol:names) {System.out.print(futbol);
		
		System.out.print(" ");}
		

	}

}
