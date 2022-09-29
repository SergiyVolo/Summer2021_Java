package review_session7;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alarm {
	public static void main(String[] args) {

		int[] wakeUpTime = { 2022, 1, 19, 22, 8 };
		
		// Setting up the time we need to wake up at using LocalDateTime class
		LocalDateTime alartTime = LocalDateTime.of(wakeUpTime[0], wakeUpTime[1], wakeUpTime[2], wakeUpTime[3], wakeUpTime[4]);
		
		// while current time is not equal to wake up time keep looping (waiting)
		while (!isTimeMacthWithCurrent(alartTime)) {
		}
		
		// once it's time to wake up -> play a wake up song (Selenium navigates to YouTube)
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\volos\\Documents\\Selenium project\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=ePADVNkOEyw");
		driver.findElement(By.cssSelector("[aria-label=\"Play\"]")).click();
	}

	public static boolean isTimeMacthWithCurrent(LocalDateTime time) {
		
		// does the year now matches the year of the alarm clock?
		boolean yearMatch = time.getYear() == LocalDateTime.now().getYear();
		// does the months now matches the month of the alarm clock?
		boolean monthMatch = time.getMonth() == LocalDateTime.now().getMonth();
		// etc..
		boolean dayMatch = time.getDayOfMonth() == LocalDateTime.now().getDayOfMonth();
		boolean hourMatch = time.getHour() == LocalDateTime.now().getHour();
		boolean minMatch = time.getMinute() == LocalDateTime.now().getMinute();
		
		// if there's match everywhere return true
		if (yearMatch && monthMatch && dayMatch && hourMatch && minMatch)
			return true;
		else
			return false;
	}
}