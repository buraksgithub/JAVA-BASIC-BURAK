package com.neotech.lesson25;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration obj= new Registration();
		
		
		obj.setEmail("ozil@yahoo");
		System.out.println(obj.getEmail());
		
		
		obj.setUserName("fenerbahce");
	    System.out.println(obj.getUserName());
		
	    
	    obj.setPassword("1234567");
	    System.out.println(obj.getPassword());
	}

}
