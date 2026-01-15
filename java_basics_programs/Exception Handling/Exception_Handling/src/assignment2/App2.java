package assignment2;

public class App2 {

	public static void main(String[] args) {
		try {
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[0]);
			System.out.println(arr[8]);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid array index accessed");
		}
	}

}
