package assignment7;

public class App7 {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("SBI intrest Rate: "+b.getIntrestRate()+" %");
		b=new HDFC();
		System.out.println("HDFC intrest Rate: "+b.getIntrestRate()+" %");

	}

}