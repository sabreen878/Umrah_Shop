package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ChangeLanguagePage;

public class ChangeLanguageTest extends TestBase{

	ChangeLanguagePage languageObject;
	
	
	@Test
	public void changeLanguageSuccess()
	{
		
		languageObject = new ChangeLanguagePage(driver);
		languageObject.ClickOnLanguagLink();
		System.out.println("The current URL is :-  " + driver.getCurrentUrl());
		System.out.println("The title is :-  " + driver.getTitle());
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.umrashop.com/");
		Assert.assertFalse(driver.getTitle().contains("???? ?? - umrashop"));
	}
}

