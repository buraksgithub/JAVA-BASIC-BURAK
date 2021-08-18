package com.neotech.lesson15;

public class Mailaddress {

	String mail(String name, String lname, String gmail) {
		
		String email= name+lname+gmail;
	
		return email;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Mailaddress object= new Mailaddress();
		
		String email= object.mail("john","snow","gmail");

		
		System.out.println(email);
	}

}
