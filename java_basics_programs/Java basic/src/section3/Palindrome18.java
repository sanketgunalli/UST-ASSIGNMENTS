package section3;
import java.util.Scanner;

public class Palindrome18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int tem =num;
		int rev = 0;
		while(num>0) {
			rev=(rev*10)+num%10;
			num/=10;
		}
		if(tem==rev) {
			System.out.print("The number is Palindrome");
		}
		else {
			System.out.print("The number is Not Palindrome");
		}
		sc.close();
	}

}
