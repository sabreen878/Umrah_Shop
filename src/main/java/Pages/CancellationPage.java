package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancellationPage extends PageBase{

	public CancellationPage(WebDriver driver) {
		super(driver);
		
		jse= (JavascriptExecutor)driver;
	}

	
	@FindBy(xpath = "/html/body/footer/div[2]/div[1]/div/div/div[1]/ul/li[3]/a")
	WebElement cancellation;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/h1")
	public WebElement cancellationMSG;
	
	
	public void ScrollDownAndClickOnCancellationLink() {
		
		scrollToBottom();
		clickButton(cancellation);
	}
}
