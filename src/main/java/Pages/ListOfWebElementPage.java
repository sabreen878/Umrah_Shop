package Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListOfWebElementPage extends PageBase{

	public ListOfWebElementPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(tagName = "a")
	List<WebElement> ElementList;
	
	
	
	public void webElementList() {
		
		List<WebElement>lists = ElementList;
		System.out.println(lists.size());
		
		for (WebElement elementListObj : lists) {
			
			System.out.println(elementListObj.getText());

		}
	}

}
