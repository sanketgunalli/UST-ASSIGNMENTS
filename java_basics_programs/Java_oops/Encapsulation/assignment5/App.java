package assignment5;

public class App {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setEmail("hari@gmail.com");
		u1.setPassword("Mypassword");
		System.out.println("Email: "+u1.getEmail());
		System.out.println("Password: "+u1.getPassword());

	}

}