package com.neotech.lesson14;

public class DogObject {

	public static void main(String[] args) {
	
//Create a Dog Class and create 3 different objects of it: 
//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
		
		
	DogsHomework husky = new DogsHomework();
	
	husky.breed="Husky";
	husky.size="Large";
    husky.color="Brown";
    
    husky.bark();
    husky.run();
    
    DogsHomework bulldog= new DogsHomework();
    
    bulldog.breed="Bulldog";
    bulldog.size="Medium";
    bulldog.color="Black";
    
    bulldog.bark();
    bulldog.run();
    
    DogsHomework labrador=new DogsHomework();
	
    labrador.breed="Labrador";
    labrador.size="Small";
    labrador.color="Grey";
    
    labrador.bark();
    labrador.run();
    
	
	
	
	}

}
