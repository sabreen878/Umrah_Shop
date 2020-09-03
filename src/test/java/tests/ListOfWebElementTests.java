package tests;

import org.testng.annotations.Test;

import Pages.ListOfWebElementPage;

public class ListOfWebElementTests extends TestBase{

	
	ListOfWebElementPage listingObject;
	
	@Test
	public void listObjects()
	{
		
		listingObject = new ListOfWebElementPage(driver);
		listingObject.webElementList();
	}
}
