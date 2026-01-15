package assignment7;

public class User {
	
	String email;
	String password;
	
	User(String email){
		this.email=email;
		this.password="Not set";
	}
	User(String email,String password){
		this.email=email;
		this.password=password;
	}
	void displayUser() {
		System.out.println("Email id: "+email);
		System.out.println("Password: "+password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User("harish123.gmail.com");
		u1.displayUser();
		System.out.println("=========================");
		User u2=new User("sarvesh332.gmail.com","hari1232");
		u2.displayUser();
	}

}