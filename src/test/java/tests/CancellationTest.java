package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CancellationPage;

public class CancellationTest extends TestBase{

	CancellationPage cancellationObject;
	
	@Test
	public void CancellationAndRefundTest()
	{
		cancellationObject = new CancellationPage(driver);
		cancellationObject.ScrollDownAndClickOnCancellationLink();
		
		Assert.assertEquals(cancellationObject.cancellationMSG.getText(), "Cancellation & Refund Policy");
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
		driver.navigate().back();
		
		System.out.println("The current URL is :- " + driver.getCurrentUrl());
		System.out.println("The current title is :- " + driver.getTitle());
		System.out.println(driver.getPageSource());
	}
}
