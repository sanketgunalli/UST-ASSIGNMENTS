package assignment7;

import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		try {	
			if(age > 18) {
				System.out.println("Age is Eligible");
			}
			else {
				throw new Exception("Age Not Eligible");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}