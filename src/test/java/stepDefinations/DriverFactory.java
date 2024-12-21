package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import framework.utility.ConfigReader;

public class DriverFactory {

	private static WebDriver driver;
	
	static String browser = ConfigReader.getProperty("browser");
	static String url = ConfigReader.getProperty("appURL");

	public static WebDriver InitilizeDriver() 
	{
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
		}
		else 
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}

		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
	
	public static WebDriver returnDriver()
	{
		return driver;
	}

}
