package assignment5;

public class SavingAccount extends Bank {
	void calculateIntrest(double amount) {
		double interest = (amount * intrestRate)/100;
		System.out.println("Interest Rate: "+intrestRate);
		System.out.println("Interest Amount: "+interest);
	}
	
}