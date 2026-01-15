package section3;
import java.util.Scanner;

public class Factorial14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int m =1;
		for(int i=1;i<=num;i++) {
			m*=i;
		}
		System.out.print("The factorial of "+num+" is "+m);
		sc.close();

	}

}
