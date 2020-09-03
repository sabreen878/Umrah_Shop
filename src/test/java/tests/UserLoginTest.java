package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.UserLoginPage;
import data.JSONDataReader;
import data.JSONDataReader1;

public class UserLoginTest extends TestBase{
	
	UserLoginPage loginObject;
	
	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		loginObject = new UserLoginPage(driver);
		JSONDataReader jsonReader = new JSONDataReader();
		jsonReader.jsonReader();
		
		loginObject.setLoginData(jsonReader.email, jsonReader.password);
		Thread.sleep(2000);
		System.out.println("The current URL is:- " + driver.getCurrentUrl());
		System.out.println("The title is :- " + driver.getTitle());
		loginObject.ClickOnLogoIcon();
		Thread.sleep(2000);
	}
	
	
	@Test(dependsOnMethods = {"UserCanLoginSuccessfully"})
	public void UserLogOut() throws InterruptedException
	{
		loginObject = new UserLoginPage(driver);
		loginObject.UserCanLogOut();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"UserLogOut"})
	public void UserCannotLogin() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		loginObject = new UserLoginPage(driver);
		JSONDataReader1 jsonReader1 = new JSONDataReader1();
		jsonReader1.jsonReader1();
		
		loginObject.setLoginData(jsonReader1.email, jsonReader1.password);
		Thread.sleep(2000);
		System.out.println("The current URL is:- " + driver.getCurrentUrl());
		System.out.println("The title is :- " + driver.getTitle());
		Assert.assertTrue(loginObject.loginErrorMSG.getText().contains("* Mismatch Credentials"));
	}
	

}
