package assignment4;

public class App4 {

	public static void main(String[] args) {
		 try {
	            int a = 10;
	            int b = 0;
	            
	            int result = a / b;
	            System.out.println("Result: " + result);

	            int[] arr = {1, 2, 3};

	            System.out.println(arr[5]);

	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception: Division by zero is not allowed");

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Exception: Invalid array index accessed");
	        }
	}

}