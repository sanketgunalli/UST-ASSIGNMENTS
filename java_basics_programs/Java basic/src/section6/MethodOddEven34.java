package section6;
import java.util.Scanner;

public class MethodOddEven34 {
	
	public static void oddOrEven(int num) {
		if(num%2==0) {
			System.out.print(num+" is Even");
		}
		else {
			System.out.print(num+" is Odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		oddOrEven(num);
		sc.close();
	}

}
