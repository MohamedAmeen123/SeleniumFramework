package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{

	public WishListPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = "button.remove-btn")
	WebElement removefromwishlistbtn;
	
	@FindBy(css = "div.no-data")
	public WebElement removefromwishconfirmmsg;
	
	public void wishlist() 
	{
		removefromwishlistbtn.click();
		
	}
}
