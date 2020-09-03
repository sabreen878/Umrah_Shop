package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;

	}

	@FindBy(linkText = "CONTACT US")
	WebElement contactUsLink;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/h1")
	public WebElement contactUsMSG;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/form/div[1]/div[1]/div/input")
	WebElement firstnamefield;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/form/div[1]/div[2]/div/input")
	WebElement lastnamefield;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/form/div[2]/div[1]/div/input")
	WebElement emailfield;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/form/div[2]/div[2]/div/input")
	WebElement phonefield;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/form/div[3]/textarea")
	WebElement messagefield;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/form/button")
	WebElement submitBTN;


	public void ScrollToContactUsPage() {

		scrollToBottom();

	}

	public void OpenContactUsPage() {

		clickButton(contactUsLink);
	}

	public void SetContactUsData(String firstanem, String lastname, String email, String phone, String message) {

		setTextElementText(firstnamefield, firstanem);
		setTextElementText(lastnamefield, lastname);
		setTextElementText(emailfield, email);
		setTextElementText(phonefield, phone);
		setTextElementText(messagefield, message);

		clickButton(submitBTN);
	}
}
