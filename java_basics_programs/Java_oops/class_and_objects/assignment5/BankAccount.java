package assignment5;

public class BankAccount {
	int accountNumber;
	String holderName;
	int balance;
	
	public BankAccount(int accountNumber,String holderNumber,int balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderNumber;
		this.balance = balance;
	}
	void showAccount() {
		System.out.println("The Account number is: "+accountNumber);
		System.out.println("The Account Holder Name is: "+holderName);
		System.out.println("The Balance is: "+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(892738272,"Raja",3000);
		b1.showAccount();
	}

}