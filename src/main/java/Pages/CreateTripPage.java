package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateTripPage extends PageBase{

	public CreateTripPage(WebDriver driver) {
		super(driver);

		jse = (JavascriptExecutor) driver;

	}


	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div[7]/div[3]/div[2]/div/div/div[1]/div/div[1]")
	WebElement cairoPage;

	@FindBy(xpath = "/html/body/div[1]/div[3]/section/div[1]/div/div[2]/div/div[9]/div/div/div[1]/div[1]/div[3]/div/div[2]/div/form/button")
	WebElement BookBtn;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div/div/div[2]/div[5]/div[1]/div/form/div[2]/div[1]/div/div[2]/div[3]/div/div[4]/div[2]/input")
	WebElement BDO;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/select[1]")
	public WebElement dateText;

	@FindBy(xpath = "/html/body/div[2]/div[1]/table/tbody/tr[5]/td[1]/a")
	WebElement WantDate;

	@FindBy(id = "passenger_passport_number_1")
	WebElement passportNumber;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div/div/div[2]/div[5]/div[1]/div/form/div[2]/div[1]/div/div[2]/div[3]/div/div[6]/div/div[2]/div/select")
	WebElement issuingCountry;

	@FindBy(id = "passenger_passport_expiry_day_1")
	WebElement ExpiryDay;

	@FindBy(id = "passenger_passport_expiry_month_1")
	WebElement ExpiryMonth;

	@FindBy(id = "passenger_passport_expiry_year_1")
	WebElement ExpiryYear;


	@FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div/div/div[2]/div[5]/div[1]/div/form/div[2]/div[12]/div/div[1]/button")
	WebElement payNowBTN;
	
	@FindBy(id = "make-payment-btn")
	WebElement continueBTN;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div/div[1]/span")
	public WebElement payingMSG;
	
	
	
	public void OpenEgyptTrip() throws InterruptedException {

		scrollToTheMiddle();
		clickButton(cairoPage);
try {
	
	Thread.sleep(8000);
	clickButton(BookBtn);
	Thread.sleep(5000);
	clickButton(BDO);
	Thread.sleep(1000);
	
} catch (Exception e) {

	System.out.println("The cause is : " + e.getCause() + "The message is" + e.getMessage());
}

		clickButton(WantDate);
		Thread.sleep(1000);
	}

	public void SetEgyptTrip(String passportnumber) throws InterruptedException{



		setTextElementText(passportNumber, passportnumber);
		Thread.sleep(1000);
		clickButton(issuingCountry);

		WebElement Countryoptions = issuingCountry;
		Select selectOptionsCountry = new Select(Countryoptions);
		System.out.println("The dropdown menu size is ..." + selectOptionsCountry.getOptions().size());
		Thread.sleep(1000);
		selectOptionsCountry.selectByValue("59");
		Thread.sleep(1000);


		clickButton(ExpiryDay);
		WebElement Dayoptions = ExpiryDay;
		Select selectOptionsDay = new Select(Dayoptions);
		System.out.println("The dropdown menu size is ..." + selectOptionsDay.getOptions().size());
		Thread.sleep(1000);
		selectOptionsDay.selectByValue("3");
		Thread.sleep(1000);


		clickButton(ExpiryMonth);
		WebElement Monthptions = ExpiryMonth;
		Select selectOptionsMonth = new Select(Monthptions);
		System.out.println("The dropdown menu size is ..." + selectOptionsMonth.getOptions().size());
		Thread.sleep(1000);
		selectOptionsMonth.selectByValue("11");
		Thread.sleep(1000);

		clickButton(ExpiryYear);
		
		WebElement Yearptions = ExpiryYear;
		Select selectOptionsYear = new Select(Yearptions);
		System.out.println("The dropdown menu size is ..." + selectOptionsYear.getOptions().size());
		Thread.sleep(1000);
		selectOptionsYear.selectByValue("2020");
		Thread.sleep(1000);
		
		clickButton(payNowBTN);
		Thread.sleep(1000);
		clickButton(continueBTN);
	}
}
