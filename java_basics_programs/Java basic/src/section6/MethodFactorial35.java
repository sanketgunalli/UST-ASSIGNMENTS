package section6;
import java.util.Scanner;

public class MethodFactorial35 {

	public static int factorial(int num) {
		int m =1;
		for(int i=1;i<=num;i++) {
			m*=i;
		}
		return m;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("Factorial of "+num+" is "+factorial(num));
		sc.close();

	}

}
