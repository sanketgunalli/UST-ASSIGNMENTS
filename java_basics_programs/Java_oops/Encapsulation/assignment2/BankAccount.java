package assignment2;

public class BankAccount {
	private int accountNumber;
	private float balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		if(balance >=0) {
			this.balance = balance;
		}
		else {
			System.out.println("Balance cannot be Negative");
		}
	}
	
	
}