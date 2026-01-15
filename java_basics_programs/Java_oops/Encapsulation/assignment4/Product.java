package assignment4;

public class Product {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>=100 && price<=100000) {
			this.price = price;
		}
		else {
			System.out.println("The Product Price is between 100 - 100000");
		}
	}
	
	

}