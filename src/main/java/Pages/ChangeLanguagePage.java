package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeLanguagePage extends PageBase{

	public ChangeLanguagePage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[2]/a/div/div")
	WebElement languageLink;
	
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[2]/ul/li[2]")
	WebElement ArabicLanguageLink;
	
	
	public void ClickOnLanguagLink() {
		
		clickButton(languageLink);
		clickButton(ArabicLanguageLink);
	}
}
