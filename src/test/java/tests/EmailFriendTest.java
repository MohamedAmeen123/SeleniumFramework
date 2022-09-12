package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.EmailFriendPage;
import pages.HomePage;
import pages.SearchPage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;

public class EmailFriendTest extends TestBase{

	// 1- User Registration

	HomePage home;
	UserRegistrationPage register;
	UserLoginPage login;
	EmailFriendPage emailfriend ;


	@Test(priority = 1, alwaysRun = true)
	public void UserCanRegisterSuccessfully() throws InterruptedException 
	{
		home = new HomePage(driver);
		register = new UserRegistrationPage(driver);

		home.openRegistrationPage();
		register.userRegistration("Mohame123", "Rashe123", "m5001@mail.com", "1471147147");
		assertTrue(register.successMessage.getText().contains("Your registration completed"));
		Thread.sleep(2000);

	}



	// 2- search on Product and click on email friend button



	@Test(dependsOnMethods = "UserCanRegisterSuccessfully")
	public void searchproducttest() throws InterruptedException 
	{
		//String productname = "Apple MacBook Pro 13-inch";
		SearchPage search;
		search = new SearchPage(driver);
		search.searchonproduct("Apple MacBook Pro 13-inch");
		//assertEquals("Apple MacBook Pro 13-inch", search.searchresult.getText());
		search.emailfriend();
		Thread.sleep(2000);

	}

	// 3- fill in the email friend form page
	
	@Test(dependsOnMethods = "searchproducttest")
		public void friendmailtest() 
	{
		emailfriend = new EmailFriendPage(driver);
		emailfriend.usercanmailproducttofriend("12354@gmail.com", "jyfuyguigiug");
		assertTrue(emailfriend.mailresultmsg.getText().contains("Your message has been sent."));



	}

}


