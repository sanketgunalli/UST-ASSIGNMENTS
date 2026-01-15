package section4;
import java.util.Scanner;

public class ArraySumAvg22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of the array is: "+sum);
		System.out.println("Average of the array is: "+(sum/n));
		
		sc.close();
	}

}
