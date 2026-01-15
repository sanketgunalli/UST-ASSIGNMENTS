package section2;

import java.util.Scanner;

public class SwitchCalc11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the choice \n 1.Add \n 2.sub \n 3.mul \n 4.div \n" );
		int a=sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Sum of two number is "+(num1+num2));
			break;
		case 2:
			System.out.println("Difference of two number is "+(num1-num2));
			break;
		case 3:
			System.out.println("Product of two number is "+(num1*num2));
			break;
		case 4:
			System.out.println("Division of two number is "+(num1/num2));
			break;
		default:
			System.out.print("Enter correct Choice");
			break;
		}
		sc.close();
	}

}
