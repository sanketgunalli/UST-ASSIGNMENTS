package section5;
import java.util.Scanner;

public class StringDuplicate32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.print("Duplicate letters are: ");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.print(str.charAt(i));
					break;
				}
			}
		}
		sc.close();
	}

}
