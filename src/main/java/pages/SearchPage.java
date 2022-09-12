package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends HomePage{

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	WebElement searchtxtbox;

	@FindBy(css = "button.button-1.search-box-button")
	WebElement searchbtn;

	@FindBy(css = "h2.product-title")
	public WebElement searchresult;

	@FindBy(css = "div.product-name")
	public WebElement productnameresult;

	@FindBy(id = "ui-id-1")
	List<WebElement> autocomletesearch;

	@FindBy (css = "button.button-2.email-a-friend-button")
	WebElement emailfriendbtn;

	@FindBy (id = "price-value-4")
	public WebElement prodpricevalue;


	public void searchonproduct( String producttosearch) 
	{
		searchtxtbox.sendKeys(producttosearch);
		searchbtn.click();
		searchresult.click();
	}

	public void searchbyautocomplete(String autoproductcomp) throws InterruptedException 
	{
		searchtxtbox.sendKeys(autoproductcomp);
		Thread.sleep(3000);
		autocomletesearch.get(0).click();

	}

	public void emailfriend() 
	{
		emailfriendbtn.click();

	}

	@FindBy(id = "add-to-wishlist-button-4")
	WebElement addtowishlistbtn;

	@FindBy(css = "span.wishlist-label")
	WebElement wishlistupperbtn;

	public void addtowish() 
	{
		addtowishlistbtn.click();
		wishlistupperbtn.click();

	}
}
