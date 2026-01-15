package section2;
import java.util.Scanner;

public class EvenOdd7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.print("Even number");
		}
		else {
			System.out.print("Odd number");
		}
		sc.close();
	}

}
