package com.neotech.lesson13;

public class Onn {

	public static void main(String[] args) {

		String[][]cars= {{"Ford","Buick"},{"Kia","Hyundai"},{"Bmw","Mercedes"},{"Maserati","Fiat"}}; 
		
		for(String[] element:cars) {
			
			for(String brand: element) {
			
			System.out.print(brand+" ");   }
		
			System.out.println();
		}
	
		
	
	}
	


}


