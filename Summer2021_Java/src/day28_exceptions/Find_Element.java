package day28_exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {
	
//	You are tasked by your company to find an element with id "mega-banner-add" and 
//	get the text out of it. 
//	Your company doesn't know which of the two websites it can be found at: 
//	either google website or yahoo website.
//	Instantiate your driver instance;
//	Navigate to the google website first, search for the element and try to get 
//	the text out of it;
//	In case it's not found there, your code must recover from the exception that
//	might arise;
//	Once you have recovered from exception - navigate to the yahoo website and 
//	perform the search there;
//	In the finally block: quit your driver instance and either print "nothing was 
//	found" or the text of the element in question
	
	public static void main(String[] args) {
		
		String elementText = "";
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\volos\\Documents\\Selenium project\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		try {
			elementText = driver.findElement(By.id("mega-banner-add")).getText();
		} catch (NoSuchElementException e) {
			driver.get("http://yahoo.com");
			elementText = driver.findElement(By.id("mega-banner-add")).getText();
		} finally {
			if(elementText.equals("")) {
				System.out.println("Nothing was found");
			} else {
				System.out.println("The element's text is: " + elementText);
			}
			driver.quit();
		}
	}
}

