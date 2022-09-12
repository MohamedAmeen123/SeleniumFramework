package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase {


	HomePage home;
	UserRegistrationPage register;
	MyAccountPage myacc;

	@Test(priority = 1, alwaysRun = true)
	public void UserCanRegisterSuccessfully() 
	{
		home = new HomePage(driver);
		register = new UserRegistrationPage(driver);

		home.openRegistrationPage();
		register.userRegistration("Mohame123", "Rashe123", "mm5@gmail.com", "147147147");
		assertTrue(register.successMessage.getText().contains("Your registration completed"));

	}
	@Test(priority = 2)
	public void enterMyAccount() 
	{
		register.ClickMyAccountLink();
	}
	
	@Test(priority = 3)
	public void chngpass () 
	{
		myacc = new MyAccountPage(driver);
		myacc.changepassinmyaccountpage("147147147", "123456123456", "123456123456");
		assertTrue(myacc.resultlbl.getText().contains("Password was changed"));
	}





}


