package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTAndDataProvider extends TestBase {
	HomePage home;
	UserRegistrationPage register;
	UserLoginPage login;

	@DataProvider(name="datatest")
	public static Object [][] userdata() 
	{
		return new Object[][] 
				{
			{"mohamed","ameen","momo@gmail.com","123123123"},
			{"momo","AA","molk@gmail.com","1147745"}
				};
	}
	
	@Test(priority = 1, alwaysRun = true, dataProvider = "datatest")
	public void UserCanRegisterSuccessfully(String fname,String lname, String email, String password) throws InterruptedException 
	{
		home = new HomePage(driver);
		register = new UserRegistrationPage(driver);

		home.openRegistrationPage();
		register.userRegistration(fname, lname, email, password);
		assertTrue(register.successMessage.getText().contains("Your registration completed"));
		register = new UserRegistrationPage(driver);
		register.userlogout();
		home.registereduserlogin();
		login= new UserLoginPage(driver);
		login.userlogin(email, password);
	}
	


}
