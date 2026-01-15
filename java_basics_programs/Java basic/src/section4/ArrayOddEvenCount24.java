package section4;
import java.util.Scanner;

public class ArrayOddEvenCount24 {

	public static void main(String[] args) {
//		5
//		10 29 38 27 32
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int cOdd=0;
		int cEven=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				cEven+=1;
			}
			else {
				cOdd+=1;
			}
		}
		System.out.println("No of Even numbers: "+cEven);
		System.out.println("No of Odd numbers: "+cOdd);
		sc.close();
	}

}
