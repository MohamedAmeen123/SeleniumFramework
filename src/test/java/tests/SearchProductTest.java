package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchProductTest extends TestBase {

	
	SearchPage search;
	 String productname = "Apple MacBook Pro 13-inch";
	
	@Test
	public void searchproducttest() 
	{
		search = new SearchPage(driver);
		search.searchonproduct(productname);
		assertEquals(productname, search.searchresult.getText());
		
	}
	
	
	
}

