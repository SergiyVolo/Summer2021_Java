package day18_encapsulation;

public class Book_Store {

	public static void main(String[] args) {
		
        Book book1 = new Book();
		
		book1.setTitle("Harry Potter");
		System.out.println(book1.getTitle());
		
		Book book2 = new Book();
		book2.setTitle("Java OCA");
		book2.setAuthor("Boyarsky");
		book2.setType("Programming Book");
		book2.setNumOfPages(500);
		book2.setIsOnSale(false);
		book2.setPrice(25);
		
		book2.getBookInfo();
		
		
		Book book3 = new Book();
		book3.setTitle("Selenium Testing Tool A Coplete Guide");
		book3.setAuthor("Gerardus Blokdyk");
		book3.setType("Programming Book");
		book3.setNumOfPages(300);
		
		book3.setBookInfo("Selenium Testing Tool A Complete Guide", "Gerardus Blokdyk", "Programming Book", 300, false, 45);
		book3.getBookInfo();
		
		book2 = book3; // assigning all the data about book3 to book2
		
		System.out.println(book2.getAuthor()); // book3 data is printed
	}

}
