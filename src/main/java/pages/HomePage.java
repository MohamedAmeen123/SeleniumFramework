package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver)  {
		super(driver);
		
		builder = new Actions(driver);
		
		
	}
	
	@FindBy(css = "a.ico-register")
	WebElement registerLink;

	public void openRegistrationPage() 
	{
		registerLink.click();
	}

	@FindBy(css = "a.ico-login")
	WebElement  loginlink;

	public void registereduserlogin() 
	{
		loginlink.click();
	}


	@FindBy(linkText = "Contact us")
	WebElement contactUsLink;
	public void ContactUs() 
	{
		contactUsLink.click();
	}


	@FindBy(id = "customerCurrency")
	WebElement currencyDDList;
	public void changecurrencyDDL() 
	{
		select= new Select(currencyDDList);
		select.selectByVisibleText("Euro");
	}

	@FindBy(linkText = "Computers")
	WebElement computermenue;

	@FindBy(linkText = "Notebooks")
	WebElement notebooksmenue;

	public void selectnotebooksmenu() 
	{

		
		builder.moveToElement(computermenue).moveToElement(notebooksmenue).click().build().perform();
	}
}
