package section6;
import java.util.Scanner;

public class MethodPrime36 {
	
	static boolean isPrime(int num) {
		int c=0;
		for(int i=1;i<=num;i++){
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente a number: ");
		int num = sc.nextInt();
		boolean result = isPrime(num);
		if(result) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not Prime number");
		}
		sc.close();
	}

}
