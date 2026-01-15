package section4;
import java.util.Scanner;

public class ArraySearch26 {

	public static void main(String[] args) {
		// 5
		// 10 29 38 27 32
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target = 38,f=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				System.out.print("Number at "+(i+1)+" position");
				f=1;
				break;
			}
		}
		if(f==0){
			System.out.print("Number is not in this array");
		}
		sc.close();

	}

}
