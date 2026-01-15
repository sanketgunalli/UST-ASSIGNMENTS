package assignment8;

public class App {

	public static void main(String[] args) {
		AtmAccount a1 = new AtmAccount(5000);
		a1.setPin(5874);
		a1.withdraw(3000);
		a1.withdraw(2000);

	}

}