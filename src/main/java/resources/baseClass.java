package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {
	
	public static WebDriver driver;           //making webdriver global

	public void driverInitialize() throws IOException
	{
	//giving path of data.properties file
	FileInputStream fis = new FileInputStream("C:\\Users\\visha\\eclipse-workspace\\practice\\src\\main\\java\\resources\\data.properties");
	
	Properties prop = new Properties();
	
	prop.load(fis);
	
	String browseName = prop.getProperty("browser");
	
	if(browseName.equalsIgnoreCase("Chrome"))
	{
		driver = new ChromeDriver();
	}
	
	else if (browseName.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	
	else if (browseName.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
    }
	else
	{
		System.out.println("enter correct browse name");
	}
	
	}
}
