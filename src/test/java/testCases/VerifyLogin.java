package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObject;
import resources.baseClass;

public class VerifyLogin extends baseClass{
	
	@Test
	public void verifyLoginDemo() throws IOException, InterruptedException
	{
		driverInitialize();                //this method is frm Base class
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		LogInPageObject obj = new LogInPageObject(driver);
		
		obj.enterUserName().sendKeys("vishla@gmail.com");
		obj.enterpassword().sendKeys("Vishal@111");
		obj.clickOnLogIn().click();
	}

}
