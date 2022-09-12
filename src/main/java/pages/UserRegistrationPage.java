package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}


	@FindBy(id = "gender-male")
	WebElement genderRdBtn;

	@FindBy(id = "FirstName")
	WebElement fntxtbox;

	@FindBy(id = "LastName")
	WebElement lntxtbox;

	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement emailtxtbox;

	@FindBy(id = "Password")
	WebElement passwordtxtbox;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmpasswordtxtbox;

	@FindBy(id="register-button")
	WebElement registerBtn;

	@FindBy(css = "div.result")
	public WebElement successMessage;

	@FindBy (linkText = "My account")
	WebElement MyAccountLink;




	public void userRegistration (String firstname, String lastname, String email, String password) {

		genderRdBtn.click();

		fntxtbox.sendKeys(firstname);

		lntxtbox.sendKeys(lastname);

		emailtxtbox.sendKeys(email);

		passwordtxtbox.sendKeys(password);

		confirmpasswordtxtbox.sendKeys(password);

		registerBtn.click();

	}


	@FindBy(css = "a.ico-logout")
	WebElement logoutbtn;


	public void userlogout() 
	{
		logoutbtn.click();
	}
	
	public void ClickMyAccountLink() 
	{
		MyAccountLink.click();
		
	}
}
