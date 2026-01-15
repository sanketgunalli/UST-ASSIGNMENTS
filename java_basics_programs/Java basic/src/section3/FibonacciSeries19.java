package section3;
import java.util.Scanner;

public class FibonacciSeries19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print("0 1 ");
		int tem1= 0,tem2=1,tem3=tem1+tem2;
		for(int i=0;i<n-1;i++) {
			System.out.print(tem3+" ");
			tem1=tem2;
			tem2=tem3;
			tem3=tem1+tem2;
		}
		sc.close();

	}

}
