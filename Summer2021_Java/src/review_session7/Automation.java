package review_session7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		// Enums help us to limit the number of possible options for input parameters
		// and make sure invalid input parameters can't be passed
		// allowing Selenium to only go to 3 websites.
		
		setupChrome();
		startAutomation(Websites.EBAY); 
		quitBrowser();
	}

	private static void setupChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\volos\\Documents\\Selenium project\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}
	
	private static void quitBrowser() {
		driver.quit();
	}
	
	public static void startAutomation(Websites site) {
		
		if(site == Websites.GOOGLE) {
			// getting the URL using Enum's public method and navigating there
			driver.get(Websites.GOOGLE.getURL());
		} else if (site == Websites.AMAZON) {
			driver.get(Websites.AMAZON.getURL());
		} else {
			driver.get(Websites.EBAY.getURL());
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

