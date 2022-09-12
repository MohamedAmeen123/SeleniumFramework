package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class HoverMenuTest extends TestBase {
	HomePage home;
	
	@Test
	public void usercanselectnotebookmenu() 
	{
		home = new HomePage(driver);
		home.selectnotebooksmenu();
	}
}
