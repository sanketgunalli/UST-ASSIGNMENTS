package assignment2;

public class Car extends Vehicle{
	String brand;
	
	void displayDetails() {
		System.out.println("Car Brand: "+brand);
		System.out.println("Car Speed: "+speed);
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
}