package section3;
import java.util.Scanner;

public class Prime20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int c=0;
		for(int i=1;i<=num;i++){
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.print("Prime number");
		}
		else {
			System.out.print("Not Prime number");
		}
		sc.close();
	}

}
