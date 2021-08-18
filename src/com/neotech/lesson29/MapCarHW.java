package com.neotech.lesson29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapCarHW {

	public static void main(String[] args) {
	//	Create a map of car models that you have in your garage and for each model the number of car you have.
	//	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
	//	For example:
	//	"BMW" -> 2
	//	"Mercedes" -> 3
	//	"Audi" -> 3
	//	"Ferrari" -> 1

	//	- Check how many entries you have.
	//	- Update the number of Audis to 5.
	//	- Add a new model with any number of cars.
	//	- Check how many Ferraris you have.
	//	- Check if you have Honda in your map.
	//	- Remove Mercedes from the map.
	//	- Get all models from the map. (use keySet() method)

	//	Note: After each step print the map.
		
		
		Map < String, Integer> Cars= new LinkedHashMap<>();
		
		Cars.put("BMW", 2);
		Cars.put("Mercedes", 3);
		Cars.put("Audi", 3);
		Cars.put("Ferrari", 1);
	
//		- Check how many entries you have.
		System.out.println(Cars.size());
		
//	- Update the number of Audis to 5.
		System.out.println(Cars);
		Cars.replace("Audi", 5);
		System.out.println(Cars);
		
//		- Check how many Ferraris you have.
		System.out.println(Cars.get("Ferrari"));
		
	
		
//		- Check if you have Honda in your map.
		if(Cars.containsKey("Honda")) {System.out.println("There is a Honda brand in map");}
		else {System.out.println("There is no Honda in map");}
		
		
//		- Remove Mercedes from the map.
		System.out.println(Cars);
		Cars.remove("Mercedes");
		System.out.println(Cars);

//		- Get all models from the map. (use keySet() method)
		
		Set<String> models= Cars.keySet();
		System.out.println(models);
		
		
	}

}
