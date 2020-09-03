package tests;

import org.testng.annotations.Test;

import Pages.ChangeCurrencyPage;

public class ChangeCurrencyTest extends TestBase{

	ChangeCurrencyPage changeCurrencyObject;
	
	@Test
	public void changeCurrentCurrencyTest() throws InterruptedException
	{
		changeCurrencyObject = new ChangeCurrencyPage(driver);
		changeCurrencyObject.ChangeCurrentCurrency();
	}
}
