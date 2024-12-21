package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinations.DriverFactory;

public class Hooks 
{
	 private static WebDriver driver;
		
	 
	 
	@Before
	public void setup()
	{
		driver = DriverFactory.InitilizeDriver();
		
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
