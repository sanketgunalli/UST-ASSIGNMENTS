package assignment4;

public class Book {
	int bookId;
	String bookName;
	float price;
	Book(){
		bookId = 1001;
		bookName = "Toy story";
		price = 299.0f;
	}
	Book(int cusId,String cusName,float price){
		this.bookId = cusId;
		this.bookName = cusName;
		this.price = price;
	}
	void displayDetails() {
		System.out.println("The book's ID: "+bookId);
		System.out.println("The book's Name: "+bookName);
		System.out.println("The book's Price "+price);
		System.out.println("=========================================");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(12,"clean code",500.0f);
		b1.displayDetails();
		Book b2 = new Book();
		b2.displayDetails();
				
				

	}

}