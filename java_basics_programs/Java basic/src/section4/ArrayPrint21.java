package section4;
import java.util.Scanner;

public class ArrayPrint21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=5;
		int arr[]= new int[n];
		System.out.println("Enter only five numbers");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
