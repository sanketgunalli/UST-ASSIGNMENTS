package assignment6;

public class App6 {

	public static void main(String[] args) {
		try {
            
            int[] arr = {10, 20, 30};

            try {
                int a = 10;
                int b = 0;
                int result = a / b; 
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Arithmetic Exception handled");
            }

            System.out.println(arr[5]);

        } catch (Exception e) {
            System.out.println("Outer Catch: General exception handled");
        }
    }

}