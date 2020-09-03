package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase{

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]")
	WebElement loginLink;
	
	@FindBy(id = "email")
	WebElement emailTXT;
	
	@FindBy(id = "password")
	WebElement passwordTXT;
	
	@FindBy(id = "login_submit")
	WebElement loginBTN;
	
	@FindBy(xpath = "//*[@id=\"hotel_search\"]/div/div/div/div[1]/div[1]")
	public WebElement messageLogin;
	
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/a/img")
	WebElement logoClick;
	
	
	@FindBy(id = "login-status-wrapper")
	public WebElement loginErrorMSG;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]")
	WebElement UserLogOutIcon;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div/ul/li[7]/a")
	WebElement UserLogoutLink;
	
	public void setLoginData(String email, String password) {
		
		clickButton(loginLink);
		setTextElementText(emailTXT, email);
		setTextElementText(passwordTXT, password);
		clickButton(loginBTN);
	}
	
	
	public void ClickOnLogoIcon() {
		clickButton(logoClick);
	}
	
	public void UserCanLogOut() {

		clickButton(UserLogOutIcon);
		clickButton(UserLogoutLink);
	}
	
}
