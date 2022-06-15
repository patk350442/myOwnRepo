package testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.base;

import java.io.IOException;

public class ValidateTitleTest extends base {
	public WebDriver driver;
	public static  Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initializeTest() throws IOException
	{

		log.info("Starting beforeTest for ValidateTitleTest..");
		driver=initializeDriver();
		log.info("initialized driver for ValidateTitleTest...");
		driver.get(prop.getProperty("url"));
		log.info("opening url for for ValidateTitleTest..");
		log.info("Ending beforeTest for ValidateTitleTest..");
		
	}
	
	@Test
	public void validateTitle() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.popClose().click();
		Assert.assertEquals(hp.getTitle().getText(),"FEATURED COURSES");
		Assert.assertTrue(hp.getNavigationBar().isDisplayed());
		log.info("successfully validated ValidateTitleTest..");
	}
	
	@AfterTest
	public void tearDown()
	{

		log.info("Starting...@AfterTest ValidateTitleTest");
		driver.close();
		log.info("Ending...@AfterTest ValidateTitleTest");
	
	}
	
}
