package assignment7;

public class Mobile {
	private String brand;
	private double price;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPriceWithGst() {
		double gst=0.18;
		return price + (price*gst);
	}
	public String getBrand() {
		return brand;
	}
}