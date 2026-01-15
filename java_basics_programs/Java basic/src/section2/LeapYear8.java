package section2;
import java.util.Scanner;

public class LeapYear8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year=sc.nextInt();
		if((year%400==0) || ((year%4==0) && (year%100!=0))){
			System.out.print(year+" is Leap Year");
		}
		else {
			System.out.print(year+" is Not Leap Year");
		}
		sc.close();
	}

}
