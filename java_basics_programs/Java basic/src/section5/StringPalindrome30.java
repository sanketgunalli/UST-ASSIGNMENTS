package section5;
import java.util.Scanner;

public class StringPalindrome30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		String res = "";
		int n=str.length();
		for(int i=0;i<n;i++) {
			res=str.charAt(i)+res;
		}
		if(res.equals(str)) {
			System.out.print("String is Palindrome");
		}
		else {
			System.out.print("String is Not Palindrome");
		}
		sc.close();
	}

}
