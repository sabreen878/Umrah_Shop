package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CreateTripPage;
import Pages.UserLoginPage;
import data.JSONDataReader;
import data.JSONDataReader2;

public class CreateTripTest extends TestBase{

	CreateTripPage createObject;
	UserLoginPage loginObject;

	
	@Test
	public void openCairoTravels() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		JSONDataReader2 jsonReader2 = new JSONDataReader2();
		jsonReader2.jsonReader2();
		
		loginObject = new UserLoginPage(driver);
		JSONDataReader jsonReader = new JSONDataReader();
		jsonReader.jsonReader();
		
		loginObject.setLoginData(jsonReader.email, jsonReader.password);
		Thread.sleep(2000);
		System.out.println("The current URL is:- " + driver.getCurrentUrl());
		System.out.println("The title is :- " + driver.getTitle());
		Thread.sleep(2000);
		
		createObject = new CreateTripPage(driver);
		createObject.OpenEgyptTrip();
		
		System.out.println(createObject.dateText.getText());
		createObject.SetEgyptTrip(jsonReader2.passportnumber);
		
		Assert.assertTrue(createObject.payingMSG.getText().contains("Pay With"));
	}
	
	
}
