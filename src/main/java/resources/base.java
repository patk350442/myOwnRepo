package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public  WebDriver initializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\pmandi\\eclipse-workspacetest\\PracticeAutomation\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			 
			driver=new ChromeDriver();
			
		}
		else
		if(browserName.contains("firefox"))
		{
			
		}
		else
		if(browserName.contains("IE"))
		{
				
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}

}
