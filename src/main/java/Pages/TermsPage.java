package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsPage extends PageBase{

	public TermsPage(WebDriver driver) {
		super(driver);
		
		jse = (JavascriptExecutor)driver;
	}

	@FindBy(xpath = "/html/body/footer/div[2]/div[1]/div/div/div[1]/ul/li[1]/a")
	WebElement termsAndCondition;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/h1")
	public WebElement tremsMSG;
	
	
	public void ScrollDownAndClickOnTermsAndConditionLink() {
		
		scrollToBottom();
		clickButton(termsAndCondition);
	}
}
