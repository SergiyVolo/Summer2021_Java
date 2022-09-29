package review_session7;

public enum Websites {

	// collection of constants
	// public static final
	
	GOOGLE("https://www.google.com/"),
	EBAY("https://www.ebay.com/"),
	AMAZON("https://www.amazon.com/");
	
	// variables and methods can have any access modifier
	private String URL;
	
	// Enum constructor is always private
	// private designator will be automatically provided by Java even if you 
	//    don't explicitly provide it
	private Websites(String URL) {
		this.URL = URL;
	}
	
	// using public method to retrieve the actual value of the URL
	public String getURL() {
		return this.URL;
	}
}
