package section5;
import java.util.Scanner;

public class StringWordCount31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String str = sc.nextLine();
		int n=str.length(),c=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.print("No of words in this sentence: "+c);
		sc.close();
	}

}
