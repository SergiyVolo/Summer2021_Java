package package1;

import day24_polymorphism.Book;

public class Library extends Book {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title = "Cucumber Book";
		book1.setPrice(15);

		Library library1 = new Library();
		library1.price = 20;
	}
}

