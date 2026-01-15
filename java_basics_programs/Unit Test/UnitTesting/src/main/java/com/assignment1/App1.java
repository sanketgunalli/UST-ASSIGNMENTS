package com.assignment1;

public class App1 {
	
	public boolean checkLoginDetails(String emailid,String password) {
		if(emailid.equalsIgnoreCase("admin@gmail.com") && password.equals("admin123")) {
			return true;
		}else {
			return false;
		}
	}
	
	public String greet(String emailId) {
		return "Welcome "+emailId;
	}
}
