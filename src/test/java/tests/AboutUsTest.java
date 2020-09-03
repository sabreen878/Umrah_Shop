package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AboutUsPage;

public class AboutUsTest extends TestBase{

	AboutUsPage aboutusObject;
	
	@Test
	public void AboutUsTest()
	{
		aboutusObject = new AboutUsPage(driver);
		aboutusObject.ScrollDownAndClickOnAboutUsPage();
		
		Assert.assertEquals(aboutusObject.AboutUsMSG.getText(), "ABOUT US");
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
		driver.navigate().back();
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
		System.out.println(driver.getPageSource());
	}
}
