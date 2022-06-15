package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	By login=By.xpath("//a[contains(@href,'sign_in')]");  //By login=By.cssSelector("a[href*='sign_in']");
	By popup_close=By.xpath("//button[contains(text(),'NO THANKS')]");
	By title=By.cssSelector("div.text-center");
	By  navbar=By.cssSelector("ul.nav.navbar-nav.navbar-right");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement popClose()
	{
		return driver.findElement(popup_close);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(navbar);
	}
}
