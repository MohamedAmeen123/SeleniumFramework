package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import pages.WishListPage;

public class WishListTest extends TestBase {
	
	SearchPage search;
	HomePage home;
	WishListPage wish;
	 String productname = "Apple MacBook Pro 13-inch";
	
	@Test
	public void searchproducttest() 
	{
		search = new SearchPage(driver);
		search.searchonproduct(productname);
		//assertEquals(productname, search.searchresult.getText());
		search.addtowish();
		wish = new WishListPage(driver);
		wish.wishlist();
		assertTrue(wish.removefromwishconfirmmsg.getText().contains("The wishlist is empty!"));
}
	
}