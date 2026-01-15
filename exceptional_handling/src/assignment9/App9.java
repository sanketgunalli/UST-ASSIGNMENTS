package assignment9;

public class App9 {
	
	static void divide() throws ArithmeticException{
		int a=10;
		int b=0;
		int res = a/b;
		System.out.println(res);
	}

	public static void main(String[] args) {
		try{
			divide();
		}catch (ArithmeticException e) {
			System.out.println("Exception handled by main function");
		}
	}

}