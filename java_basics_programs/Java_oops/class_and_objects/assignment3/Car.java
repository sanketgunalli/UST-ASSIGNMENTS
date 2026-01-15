package assignment3;

public class Car {
	String brand;
	String model;
	float price;
	
	Car(String brand,String model,float price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void displayDetails(String cname) {
		System.out.println("Car name: "+cname);
		System.out.println("The Cars Brand: "+brand);
		System.out.println("The Cars Model: "+model);
		System.out.println("The Cars Price: "+price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car innova = new Car("Toyota","Crysta", 4500000);
		innova.displayDetails("innova");
		System.out.println("-----------------------");
		Car bmw = new Car("BMW","M3",5000000);
		bmw.displayDetails("BMW m3");

	}

}