package assignment7;

public class App {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.setBrand("Samsung");
		m1.setPrice(20000);
		System.out.println("Brand: "+m1.getBrand());
		System.out.println("Price with GST: "+m1.getPriceWithGst());

	}

}