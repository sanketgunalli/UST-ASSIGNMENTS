package assignment3;

public class App3 {

	public static void main(String[] args) {
		String str1 = "assignment";
		String str2 = null;
		
		try {
			System.out.println("length: "+str1.length());
			System.out.println("length: "+str2.length());
		}catch (NullPointerException e) {
			System.out.println("Null value cannot be used");
		}
	}

}