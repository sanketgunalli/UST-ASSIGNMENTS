package section3;
import java.util.Scanner;

public class ReverseNum17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int rev = 0;
		while(num>0) {
			rev=(rev*10)+num%10;
			num/=10;
		}
		System.out.print("The reverse of this number is "+rev);
		sc.close();
	}

}
