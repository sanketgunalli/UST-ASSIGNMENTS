package section6;
import java.util.Scanner;

public class MethodMaxOfTwoNum37 {
	
	static void maxOfTwoNumber(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1+" is grather than "+num2);
		}
		else{
			System.out.println(num2+" is grather than "+num1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2:");
		int num2 = sc.nextInt();
		maxOfTwoNumber(num1,num2);
		sc.close();
	}

}
