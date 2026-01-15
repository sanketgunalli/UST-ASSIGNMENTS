package assignment8;

import java.io.InvalidClassException;
import java.util.Scanner;

public class App8 {

	static final double minbal = 1000;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the account balance");
			double bal = sc.nextDouble();
			sc.close();
			if(bal<minbal) {
				throw new InvalidClassException("Invalid Balance: Minimum balance must be 1000");
				
			}
			System.out.println("Balance is sufficient");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}