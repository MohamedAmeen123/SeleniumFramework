package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;

public class ChangeCurrencyTest extends TestBase{

	HomePage home;
	SearchPage search;
	
	@Test
	public void changecurrencytest() 
	{
		home=new HomePage(driver);
		search = new SearchPage(driver);
		String prodname = "Apple MacBook Pro 13-inch";
		home.changecurrencyDDL();
		search.searchonproduct(prodname);
		assertTrue(search.prodpricevalue.getText().contains("€"));
	}
	
	
	
}
