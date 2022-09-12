package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "FullName")
	WebElement ContFullName;
	
	@FindBy(id = "Email")
	WebElement contEmail;
	
	@FindBy(id = "Enquiry")
	WebElement contEnquiry;
	
	@FindBy(css = "button.button-1.contact-us-button")
	WebElement submitbtn;
	
	@FindBy (css = "div.result")
	public WebElement contsuccmsg;
	
	public void contUs(String fullname, String email, String enquiry ) 
	{
		ContFullName.sendKeys(fullname);
		contEmail.sendKeys(email);
		contEnquiry.sendKeys(enquiry);
		submitbtn.click();
		
		
	}
	
}
