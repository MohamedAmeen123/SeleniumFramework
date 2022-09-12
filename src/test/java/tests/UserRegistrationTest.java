package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {
	HomePage home;
	UserRegistrationPage register;
	UserLoginPage login;



	@Test(priority = 1, alwaysRun = true)
	public void UserCanRegisterSuccessfully() 
	{
		home = new HomePage(driver);
		register = new UserRegistrationPage(driver);

		home.openRegistrationPage();
		register.userRegistration("Mohame123", "Rashe123", "mm5555@gmail.com", "666666");
		assertTrue(register.successMessage.getText().contains("Your registration completed"));

	}
	@Test(dependsOnMethods = "UserCanRegisterSuccessfully")
	public void registereduserlogout() 
	{
		register = new UserRegistrationPage(driver);
		register.userlogout();

	}


	@Test(dependsOnMethods = "registereduserlogout")
	public void UserLogin() 
	{
		home.registereduserlogin();
		login= new UserLoginPage(driver);
		login.userlogin("mm5555@gmail.com", "666666");



	}


}
