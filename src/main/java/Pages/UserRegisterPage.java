package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterPage extends PageBase{

	public UserRegisterPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]")
	WebElement loginLink;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]/form/div[11]/div[2]/a")
	WebElement registerLink;
	
	@FindBy(name = "first_name")
	WebElement firstNameTXT;
	
	@FindBy(name = "last_name")
	WebElement lastNameTXT;
	
	@FindBy(id = "referal_email")
	WebElement emailTxt;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/form/div[3]/input")
	WebElement passwordTxt;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/form/div[4]/input")
	WebElement confirmPasswordTXT;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/select")
	WebElement countryCodeDropdown;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[3]/input")
	WebElement phoneTXT	;
	
	@FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/form/div[6]/div[2]/div/div/label")
	WebElement checkBox;
	
	@FindBy(id = "register_user_button")
	WebElement registerBTN;
	
	@FindBy(id = "register-status-wrapper")
	public WebElement registerMessage;
	
	@FindBy(id = "register-error-msg")
	public WebElement ErrorLoginMSG;
	public void OpenRegisterPage() {
		
		clickButton(loginLink);
		clickButton(registerLink);
	}
	
	public void UserSetRegisterData(String firstname, String lastname , String email, String password, String phone) {
		
		setTextElementText(firstNameTXT, firstname);
		setTextElementText(lastNameTXT, lastname);
		setTextElementText(emailTxt, email);
		clickButton(countryCodeDropdown);
		setTextElementText(phoneTXT, phone);
		setTextElementText(passwordTxt, password);
		setTextElementText(confirmPasswordTXT, password);
		clickButton(checkBox);
		clickButton(registerBTN);
		
	}
	
}
