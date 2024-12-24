package framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

	public static String getProperty(String key) 
	{

		Properties prop=new Properties();
		
		try 
		{
			prop.load(new FileInputStream(new File("./ConfigFiles/Config.properties")));
		} 
		catch(IOException e) {
		
			
			
		}
		
		String value=prop.getProperty(key);
		
		return value;
		
	}
	

}
