package section5;
import java.util.Scanner;

public class StringConvert33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lowercase to Uppercase");
		System.out.print("Enter a string: ");
		String str1 = sc.nextLine();
		System.out.print("Uppercase: "+str1.toUpperCase());
		
		System.out.println();
		
		System.out.println("Uppercase to Lowercase ");
		System.out.print("Enter a string: ");
		String str2 = sc.nextLine();
		System.out.print("Lowercase: "+str2.toLowerCase());
		
		sc.close();

	}

}
