package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.SearchPage;

public class AutoCompleteSearch extends TestBase {

	SearchPage search;
	String productname = "Apple MacBook Pro 13-inch";
	@Test
	public void usercansearchbyautocomplete() throws InterruptedException 
	{
		search = new SearchPage(driver);
		search.searchbyautocomplete("MacB");
		assertTrue(search.productnameresult.getText().contains(productname));


	}


}
