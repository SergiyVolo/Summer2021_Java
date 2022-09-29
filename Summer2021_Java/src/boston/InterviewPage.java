package boston;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterviewPage {
	
	
	public InterviewPage(){
		
	//	PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (id = "login-signin")
	private  WebElement nextButton;

	public WebElement getNextButton() {
		return nextButton;
	}

	public void setNextButton(WebElement nextButton) {
		this.nextButton = nextButton;
	}
	
	
}