package assignment5;

public class Payment {
	void pay(int amount) {
		System.out.println("Payment Amount: "+amount);
		System.out.println("Payment using Default mode");
	}
	void pay(int amount,String mode) {
		System.out.println("Payment Amount: "+amount);
		System.out.println("Payment Mode: "+mode);
	}
}