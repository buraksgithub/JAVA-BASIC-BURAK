package com.neotech.lesson25;

public class Registration {

	//Create Registration Class in which you would have variables as email, userName and password 
	//that have an access scope only within its own class. 
	//After creating an object of the class user should be able to call methods 
	//and in each method separately pass values to set users email, username and password.

	
	private String email;
	private String userName;
	private String password;
	
	
	//Valid email consider to be only yahoo!
	public String getEmail() { return email;}
    public void setEmail(String email) {
    	if(!email.isEmpty()) {
    		
    		if (email.contains("yahoo")) {this.email = email;}
    		else {System.out.println("Please enter a yahoo account");}
    		}
    	
    	else {System.out.println("Email can not be empty");}          }

    
    //Valid userName and password cannot be empty and should be of length larger than 6 characters.
    public String getUserName() {return userName;}
    public void setUserName(String userName) {
    	
    	if (!userName.isEmpty() &&  userName.length()>6) {this.userName = userName;}
    	
    	else {System.out.println("Please enter a longer username");}      }

	
    //Also valid password cannot contain userName.
    public String getPassword() {return password;}
    public void setPassword(String password) {
    	if (!password.isEmpty() &&  password.length()>6 && !password.contains(userName)) {this.password = password;}
    	
    	else {System.out.println("Please enter a valid password");}
    	
  }

   

}
