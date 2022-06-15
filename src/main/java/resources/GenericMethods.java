package resources;
import resources.base;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class GenericMethods extends base {

	
	public static boolean IsElementPresent(WebElement ele)
	{
		try {
		ele.isDisplayed();
		} catch (NoSuchElementException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
}
