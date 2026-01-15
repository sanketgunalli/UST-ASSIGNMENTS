package assignment5;

public class User {
	private String  email;
	private String password;
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		if(password.length()>=8) {
			this.password=password;
		}
		else {
			System.out.println("The password must be at least 8 Characters long");
		}
	}
	public String getPassword() {
		return password;
	}
	
}