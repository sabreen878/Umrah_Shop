package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Pages.SearchPage;
import data.JSONDataReaderSearchKeys;

public class SearchTest extends TestBase{

	
	SearchPage searchObject;
	
	@Test
	public void searchTest() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		JSONDataReaderSearchKeys jsonReaderContactKeys = new JSONDataReaderSearchKeys();
		jsonReaderContactKeys.jsonReaderContactKeys();
		
		searchObject = new SearchPage(driver);
		searchObject.SetSearchData(jsonReaderContactKeys.fromcity, jsonReaderContactKeys.tocity);
	}
}
