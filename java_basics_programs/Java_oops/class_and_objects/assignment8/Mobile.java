package assignment8;

public class Mobile {
	
	String brand;
	int ram;
	int storage;
	int price;
	
	Mobile(String brand) {
		this.brand = brand;
	}
	Mobile(String brand,int ram) {
		this.brand = brand;
		this.ram = ram;
	}
	Mobile(String brand,int ram,int storage) {
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
	}
	Mobile(String brand,int ram,int storage,int price) {
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}
	void displayMobile() {
		System.out.println("Brand  : "+brand);
		System.out.println("RAM    : "+ram+" GB");
		System.out.println("Storage: "+storage+" GB");
		System.out.println("Price  : "+price);
		System.out.println("=====================");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile("Redmi");
		Mobile m2 = new Mobile("Realme",8);
		Mobile m3 = new Mobile("Samsung",8,256);
		Mobile m4 = new Mobile("Apple",8,512,40000);
		
		m1.displayMobile();
		m2.displayMobile();
		m3.displayMobile();
		m4.displayMobile();

	}

}