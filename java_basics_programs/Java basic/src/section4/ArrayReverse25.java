package section4;
import java.util.Scanner;

public class ArrayReverse25 {

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
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
