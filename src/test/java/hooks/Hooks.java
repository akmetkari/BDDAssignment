package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinations.DriverFactory;

public class Hooks 
{
	 private static WebDriver driver;
		
	 
	 
	@Before(order=0)
	public void setup()
	{
		driver = DriverFactory.getDriver();
		
	}
	
	
	@After
	public void tearDown()
	{
		 if (driver != null) 
	        {
	            driver.quit();
	            driver = null;
	        }
	}
	
}
