package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends HomePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Change password")
	WebElement changepasswordlink;

	@FindBy(id = "OldPassword")
	WebElement oldpassword;

	@FindBy(id = "NewPassword")
	WebElement newpassword;

	@FindBy (id = "ConfirmNewPassword")
	WebElement confirmnewpass;

	@FindBy (css = "button.button-1.change-password-button")
	WebElement changepassbtn;

	@FindBy (css = "p.content")
	public WebElement resultlbl;

	public void changepassinmyaccountpage(String oldpass, String newpass, String confirmpass ) 
	{
		changepasswordlink.click();
		oldpassword.sendKeys(oldpass);
		newpassword.sendKeys(newpass);
		confirmnewpass.sendKeys(confirmpass);
		changepassbtn.click();


	}

}
