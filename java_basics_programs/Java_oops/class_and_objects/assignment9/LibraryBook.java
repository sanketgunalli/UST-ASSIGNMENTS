package assignment9;

public class LibraryBook {

	 int bookId;
	 String title;
	 String author;
	 boolean available;

	 LibraryBook(int bookId, String title, String author, boolean available) {
		 this.bookId = bookId;
		 this.title = title;
	     this.author = author;
	     this.available = available;
	 }
	 boolean isAvailable() {
		 return available;
	 }
	 void displayBook() {
	    System.out.println("Book ID : " + bookId);
	    System.out.println("Title   : " + title);
	    System.out.println("Author  : " + author);

	    if (isAvailable())
	      System.out.println("Status  : Available");
	    else
	        System.out.println("Status  : Not Available");
	}

	public static void main(String[] args) {

	    LibraryBook b1 = new LibraryBook(101, "Java", "James Gosling", true);
	    LibraryBook b2 = new LibraryBook(102, "Python", "Guido", false);

	    b1.displayBook();
	    System.out.println();
	    b2.displayBook();
	    }
}