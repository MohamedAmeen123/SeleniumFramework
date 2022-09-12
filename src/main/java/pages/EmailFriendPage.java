package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends PageBase {

	public EmailFriendPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "input#FriendEmail.friend-email")
	WebElement friendemailtxtbox;

	@FindBy(css = "button.button-1.send-email-a-friend-button")
	WebElement sendemailbtn;
	
	@FindBy(css = "div.result")
	public WebElement mailresultmsg;
	
	@FindBy(id = "PersonalMessage")
	WebElement persomsg;

	public void usercanmailproducttofriend(String friendmail, String msgperso) 
	{
		friendemailtxtbox.sendKeys(friendmail);
		persomsg.sendKeys(msgperso);
		sendemailbtn.click();
		
		
		
	}
}
