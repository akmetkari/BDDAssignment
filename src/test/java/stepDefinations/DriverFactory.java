package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory 
{

	 private static WebDriver driver;
	
	    public static WebDriver getDriver() 
	    {
	        
	            driver = new ChromeDriver(); 
	            
	            driver.manage().window().maximize(); 
	            driver.get("https://magento.softwaretestingboard.com/");
	        
	        return driver;
	    }
	
	    public static void quitDriver() 
	    {
	        if (driver != null) 
	        {
	            driver.quit();
	            driver = null;
	        }
	    }
	
}
