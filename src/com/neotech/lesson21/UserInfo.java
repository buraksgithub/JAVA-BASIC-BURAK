package com.neotech.lesson21;

public class UserInfo extends UserClass {

	
	

	String address;
	
	UserInfo (String name, int number, String address) {
		super(name, number);
	    this.address=address;
		
	}
	
	void userdetails() {  System.out.println(name+ " phone number is: "+ number+ " and address is : "+ address);}

	
	
	
	public static void main(String[] args) {
		
		UserInfo call= new UserInfo("John",31399900,"1111 Wilshire Blvd");
		call.userdetails();
	}
	

}
