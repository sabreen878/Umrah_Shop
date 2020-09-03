package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.TermsPage;

public class TermsTests extends TestBase{

	TermsPage termsAndConditionObject;
	
	@Test
	public void clickLinkTermCondition()
	{
		
		termsAndConditionObject = new TermsPage(driver);
		termsAndConditionObject.ScrollDownAndClickOnTermsAndConditionLink();
		Assert.assertTrue(termsAndConditionObject.tremsMSG.getText().contains("Terms & Conditions"));
		
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
		driver.navigate().back();
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
	}
}
