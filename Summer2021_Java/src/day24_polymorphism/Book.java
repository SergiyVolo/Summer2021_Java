package day24_polymorphism;

public class Book {

	private int numberOfWords;
	String author;
	protected double price;
	public String title;
	
	private void calculateWords() {
		System.out.println("Calculating number of words...");
	}
	
	protected String getAuthor() {
		return author;
	} 
	
	public void setPrice(double price) {
		this.price = price;
		System.out.println(price);
	}

	@Override
	public String toString() {
		return "Book [numberOfWords=" + numberOfWords + ", author=" + author + ", price=" + price + ", title=" + title
				+ "]";
	}
}
