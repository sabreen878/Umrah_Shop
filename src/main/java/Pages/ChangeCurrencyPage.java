package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeCurrencyPage extends PageBase{

	public ChangeCurrencyPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[1]/a/div/div[3]")
	WebElement currecnyDropDown;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[1]/ul/li[4]/a/span[3]")
	WebElement currencyWanted;
	
	
	public void ChangeCurrentCurrency() throws InterruptedException {
		
		clickButton(currecnyDropDown);
		Thread.sleep(1000);
		
		clickButton(currencyWanted);
		Thread.sleep(1000);

	}
}
