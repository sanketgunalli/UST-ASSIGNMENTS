package assignment4;

public class Login {
	void login(String email) {
		System.out.println("Login using Email: "+email);
	}
	void login(String email,String password) {
		System.out.println("Login using email and password");
		System.out.println("Email: "+email+"\nPassword: "+password);
	}
}