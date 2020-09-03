package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ContactUsPage;
import data.JSONDataReader;

public class ContactUsTest extends TestBase{

	ContactUsPage contactUsObject;
	
	
	@Test
	public void ContactUsPage() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		JSONDataReader jsonReader = new JSONDataReader();
		jsonReader.jsonReader();
		contactUsObject = new ContactUsPage(driver);
		contactUsObject.ScrollToContactUsPage();
		contactUsObject.OpenContactUsPage();
		Assert.assertTrue(contactUsObject.contactUsMSG.getText().contains("CONTACT US"));
		Thread.sleep(1000);
		contactUsObject.SetContactUsData(jsonReader.firstname, jsonReader.lastname, jsonReader.email, jsonReader.phone, jsonReader.message);
		System.out.println("The current URL is:- " + driver.getCurrentUrl());
		System.out.println("The current title is:- " + driver.getTitle());
	}
}
