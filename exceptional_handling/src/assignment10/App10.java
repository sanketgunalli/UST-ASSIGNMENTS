package assignment10;

public class App10 {
	static void calculate() throws ArithmeticException{
		try {
			int a=10;
			int b=0;
			int res = a/b;
			System.out.println(res);
		}catch (ArithmeticException e) {
			System.out.println("Exception caught in calculate() method");
			throw e;
		}
	}

	public static void main(String[] args) {
		try{
			calculate();
		}catch (ArithmeticException e) {
			System.out.println("Exception handled by main function");
		}
	}
}