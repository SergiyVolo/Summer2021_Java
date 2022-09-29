package day24_polymorphism;

public class BookStore {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.author = "Kathy Sierra";
		book1.title = "Head First Java";
		book1.price = 29.97;
//		book1.numberOfWords = 1234;    private is not accessible here
		
		System.out.println(book1.price);
		System.out.println(book1.getAuthor());
		book1.setPrice(30);
		
		System.out.println(book1);
	}

}

