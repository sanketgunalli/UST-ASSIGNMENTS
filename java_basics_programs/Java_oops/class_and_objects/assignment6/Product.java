package assignment6;

public class Product {
	int productId;
	String productName;
	int price;
	
	Product(int productId,String productName,int price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	void productInfo(){
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(201, "Mobile", 200000);
		p1.productInfo();

	}

}