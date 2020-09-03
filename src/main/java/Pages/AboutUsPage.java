package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends PageBase{

	public AboutUsPage(WebDriver driver) {
		super(driver);
		
		jse = (JavascriptExecutor)driver;
	}

	@FindBy(xpath = "/html/body/footer/div[2]/div[1]/div/div/div[2]/ul/li[1]/a")
	WebElement aboutusLink;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/h1")
	public WebElement AboutUsMSG;
	
	
	
	public void ScrollDownAndClickOnAboutUsPage() {
		
		scrollToBottom();
		clickButton(aboutusLink);
	}
}
