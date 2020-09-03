package tests;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.UserRegisterPage;
import data.JSONDataReader;
import data.JSONDataReader1;

public class UserRegisterTest extends TestBase{

	UserRegisterPage registerObject;
	
	
	
	@Test(dependsOnMethods = {"UserCanRegistersuccessfully"})
	public void UserCannotRegister() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{	
		registerObject = new UserRegisterPage(driver);
		registerObject.OpenRegisterPage();
		JSONDataReader jsonReader = new JSONDataReader();
		jsonReader.jsonReader();

		registerObject.UserSetRegisterData(jsonReader.firstname, jsonReader.lastname, jsonReader.email, jsonReader.password, jsonReader.phone);
		WebElement options = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/select"));
		Select selectOptions = new Select(options);
		System.out.println("The dropdown menu size is ..." + selectOptions.getOptions().size());
		Thread.sleep(2000);
		selectOptions.selectByValue("59");
		Assert.assertFalse(registerObject.ErrorLoginMSG.getText().contains("ksabreen@safavisa.comEmail Already Registered!!!"));
	}
	
	@Test
	public void UserCanRegistersuccessfully() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{	
		registerObject = new UserRegisterPage(driver);
		registerObject.OpenRegisterPage();
		JSONDataReader1 jsonReader1 = new JSONDataReader1();
		jsonReader1.jsonReader1();

		registerObject.UserSetRegisterData(jsonReader1.firstname, jsonReader1.lastname, jsonReader1.email, jsonReader1.password, jsonReader1.phone);
		WebElement options = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/select"));
		Select selectOptions = new Select(options);
		System.out.println("The dropdown menu size is ..." + selectOptions.getOptions().size());
		Thread.sleep(2000);
		selectOptions.selectByValue("59");
		Assert.assertFalse(registerObject.registerMessage.getText().contains("You have successfully registered with us!!! You will receive an e-mail containing the account verification link."));
	}
 
}
