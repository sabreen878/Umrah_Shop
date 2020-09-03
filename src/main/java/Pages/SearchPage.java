package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id = "from_new")
	WebElement FromDir;
	
	@FindBy(xpath = "/html/body/ul[13]/li/a")
	WebElement mombasaSelection; 
	
	@FindBy(id = "to_new")
	WebElement ToDir;
	
	@FindBy(xpath = "/html/body/ul[15]/li[1]/a/span[1]")
	WebElement islandSelection;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div[3]/div[2]/div[1]/div/div[1]/div/div/i")
	WebElement exchangeArrow;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/table/tbody/tr[2]/td[5]/a")
	WebElement departureDate;
	
	
	@FindBy(id = "flight-form-submit")
	WebElement searchBTN;
	
	
	public void SetSearchData(String fromcity, String tocity) throws InterruptedException {
		
		setTextElementText(FromDir, fromcity);
		clickButton(mombasaSelection);
		Thread.sleep(1000);
		setTextElementText(ToDir, tocity);
		clickButton(islandSelection);
		Thread.sleep(2000);
		clickButton(departureDate);
		Thread.sleep(1000);
		clickButton(searchBTN);
		Thread.sleep(1000);

	}
}
