package assignment8;

public class AtmAccount {
	private int pin;
	private double balance;
	
	public AtmAccount(double balance) {
		this.balance = balance;
	}
	
	public void setPin(int pin) {
		if(pin>=1000 && pin<=9999) {
			this.pin = pin;
			System.out.println("PIN set successfully");
		}
		else {
			System.out.println("Invalid PIN. PIN must be 4 digits");
		}
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount");
		}
		else if(amount<=balance) {
			balance = balance - amount;
			System.out.println("Withdrawal Successfull");
			System.out.println("Remaining Balance is "+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}