package section5;
import java.util.Scanner;

public class StringVowelCount28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente a string: ");
		String str = sc.nextLine();
		int vCount = 0,cCount = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u') {
				vCount++;
			}
			else {
				cCount++;
			}
		}
		System.out.println("No of vowels in this string is: "+vCount);
		System.out.println("No of consonants in this string is: "+cCount);
		sc.close();
	}

}
