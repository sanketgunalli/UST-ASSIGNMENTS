package section4;
import java.util.Scanner;

public class ArraySmallLarge23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp1=arr[0];
		for(int i=1;i<n;i++) {
			if(temp1>arr[i]) {
				temp1=arr[i];
			}
		}
		System.out.print(temp1+" ");
		int temp2=arr[0];
		for(int i=1;i<n;i++) {
			if(temp2<arr[i]) {
				temp2=arr[i];
			}
		}
		System.out.print(temp2+" ");
		sc.close();
	}

}
