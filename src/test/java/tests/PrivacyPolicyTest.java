package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.PrivacyPolicyPage;

@Test
public class PrivacyPolicyTest extends TestBase{

	PrivacyPolicyPage PrivacyPolicyObject;
	
	public void PrivacyPolicyTest()
	{
		PrivacyPolicyObject = new PrivacyPolicyPage(driver);
		PrivacyPolicyObject.ScrollDownAndClickOnPrivacyPolicyLink();
		Assert.assertEquals(PrivacyPolicyObject.privacyPageMSG.getText(), "Privacy Policy");
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
		driver.navigate().back();
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
		
	}
}
