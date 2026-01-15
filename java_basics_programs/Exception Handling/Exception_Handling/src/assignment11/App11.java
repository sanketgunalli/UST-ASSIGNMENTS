package assignment11;

public class App11 {

	public static void main(String[] args) {
		try {
			Parent p1 =new Child();
			p1.show();
		}catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

}
