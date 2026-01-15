package section1;
import java.util.Scanner;

class SimpleIntrest3{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Principal Amount: ");
        float principal = sc.nextFloat();
        System.out.println("Enter the rate of intrest: ");
        float rate= sc.nextFloat();
        System.out.println("Enter the years: ");
        float time= sc.nextFloat();
        float simple_interst = (principal*rate*time)/100;
        System.out.println("The simple intrest is: "+simple_interst);
        sc.close();
   }
}