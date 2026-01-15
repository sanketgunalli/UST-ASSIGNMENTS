package section2;
import java.util.Scanner;

public class Grade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student mark: ");
		int mark=sc.nextInt();
		if(mark>=90) {
			System.out.print("A Grade");
		}
		else if(mark>=75) {
			System.out.print("B Grade");
		}
		else if(mark>=60) {
			System.out.print("C Grade");
		}
		else {
			System.out.print("Fail");
		}
		sc.close();
	}

}
