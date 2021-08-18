package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbersHW {

	public static void main(String[] args) {
		//    Create an arrayList of even numbers from 1 to 50. 
		//Using Iterator remove any number that is divisible by 5 from that arrayList.
		
		
		
		
//	    Create an arrayList of even numbers from 1 to 50. 
		ArrayList<Integer> even= new ArrayList<>();
		
		for (int num=2; num<=50; num+=2) {
			
		even.add(num);  }
		
		
		
		Iterator<Integer> it = even.iterator();
		
		while(it.hasNext()) { int number= it.next();
			
		
		
			if(number%5==0) { it.remove();}
			
			
			
		}
           
		System.out.println(even);     
	}

}

