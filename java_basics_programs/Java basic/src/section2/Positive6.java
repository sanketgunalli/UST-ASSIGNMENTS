package section2;
import java.util.Scanner;

public class Positive6 {
	public static void main(String[] args) {
		System.out.println("Check whether the number is positive,negative,or zero");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if(a>0) {
			System.out.print("Positive number");
		}
		else if(a<0) {
			System.out.print("Negative number");
		}
		else {
			System.out.print("Zero");
		}
		sc.close();
	}
}
