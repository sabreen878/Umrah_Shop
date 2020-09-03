package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicyPage extends PageBase{

	public PrivacyPolicyPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "/html/body/footer/div[2]/div[1]/div/div/div[1]/ul/li[2]/a")
	WebElement privacypolicyLink;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/h1")
	public WebElement privacyPageMSG;
	
	
	public void ScrollDownAndClickOnPrivacyPolicyLink() {
		
		scrollToBottom();
		clickButton(privacypolicyLink);
	}
	
}
