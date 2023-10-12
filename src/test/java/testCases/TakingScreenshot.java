package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenshot {
    
	@Test
      
	  public void ss() throws InterruptedException, IOException
	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://login.salesforce.com/?locale=in");
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		  //full page screenshot
		 /* TakesScreenshot sss =(TakesScreenshot)driver;     
		
		  File source =sss.getScreenshotAs(OutputType.FILE);  
		  
		  File dest = new File("D:\\JAVA PRACTICE\\p1.jpg");
		  
		  FileUtils.copyFile(source, dest);*/
		  
		  
		  //small section of page
		  
		  WebElement a=driver.findElement(By.xpath("//*[@id=\"main\"]"));
		
		  File b = a.getScreenshotAs(OutputType.FILE);
		  
		  File c = new File("D:\\JAVA PRACTICE\\p2.jpg");
		  
		  FileUtils.copyFile(b, c);
		  
	  }
}
