package day18_encapsulation;

public class Book {
	
	private String title;
	private String author;
	private String type;
	private int numOfpages;
	private boolean isOnSale;
	private double price;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String bookTitle) {
		title = bookTitle;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String bookAuthor) {
		author = bookAuthor;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String bookType) {
		type = bookType;	
	}
	
	public int getNumOfPages() {
		return numOfpages;
	}
	
	public void setNumOfPages(int bookNumOfPages) {
		numOfpages = bookNumOfPages;
	}
	
	public boolean getIsOnSale() {
		return isOnSale;
	}
	
	public void setIsOnSale(boolean bookIsOnSale) {
		isOnSale = bookIsOnSale;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double bookPrice) {
		price = bookPrice;
	}
	
	public void getBookInfo() {
		System.out.println("The title is: " + title);
		System.out.println("The author is: " + author);
		System.out.println("The type is: " + type);
		System.out.println("The numOfPages is: " + numOfpages);
		System.out.println("The book is on sale: " + isOnSale);
		System.out.println("The price is: " + price);
	}
	
	public void setBookInfo(String bookTitle, String bookAuthor, String bookType, int bookNumOfPages, boolean bookIsOnSale, double bookPrice) {
		setTitle(bookTitle);
		setAuthor(bookAuthor);
		setType(bookType);
		setNumOfPages(bookNumOfPages);
		isOnSale = bookIsOnSale;
		price = bookPrice;
}

}