package section1;
import java.util.Scanner;

public class Convert5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("****** Convertion of  Celsius to fahrenheit *****");
		System.out.println("Enter the Degree Celsius: ");
		float celsius = sc.nextFloat();
		float fahrenheit = ((celsius*9)/5)+32;
		System.out.println("Fahrenheit is "+ fahrenheit);
		System.out.println("****** Convertion of  Kilometers to miles *****");
		System.out.println("Enter the Kilometers to miles");
		float kilometer =  sc.nextFloat();
		double miles = kilometer * 0.62137119;
		System.out.println("Miles is "+ miles);
		sc.close();
	}

}
