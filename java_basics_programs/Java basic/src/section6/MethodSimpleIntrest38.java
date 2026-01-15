package section6;
import java.util.Scanner;

public class MethodSimpleIntrest38 {

	static float simpleIntrest(float principal,float rate,float time) {
		 return (principal*rate*time)/100;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Principal Amount: ");
       float principal = sc.nextFloat();
       System.out.println("Enter the rate of intrest: ");
       float rate= sc.nextFloat();
       System.out.println("Enter the years: ");
       float time= sc.nextFloat();
       float simple_interst = simpleIntrest(principal,rate,time);
       System.out.println("The simple intrest is: "+simple_interst);
       sc.close();
  }
}
