package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase{

	public UserLoginPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id = "Email")
	WebElement emailtxtbox;
	
	@FindBy(id = "Password")
	WebElement passwordtxtbox;
	
	@FindBy(css = "button.button-1.login-button")
	WebElement loginbtn;
	
	public void userlogin(String email, String password) 
	{
		emailtxtbox.sendKeys(email);
		passwordtxtbox.sendKeys(password);
		loginbtn.click();
		
		
	}



}
