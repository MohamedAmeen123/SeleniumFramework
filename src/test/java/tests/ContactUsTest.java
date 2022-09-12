package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {
	HomePage home;
	ContactUsPage contact;
	
	
	@Test
	public void ContactUsTestcase() 
	{
		home = new HomePage(driver);
		home.ContactUs();
		contact = new ContactUsPage(driver);
		contact.contUs("Moha", "m@gmail.com", "pleasegoodmorning");
		assertTrue(contact.contsuccmsg.getText().contains("Your enquiry has been successfully sent to the store owner."));
		
	}
	

}
