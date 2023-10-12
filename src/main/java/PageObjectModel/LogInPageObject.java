package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObject {
	
	public WebDriver driver;         //making driver public

	private By username = By.xpath("//*[@id=\"username\"]");
	
	private By passsword = By.xpath("//*[@id=\"password\"]");

	private By LogIn = By.xpath("//*[@id=\"Login\"]");
			
	public LogInPageObject(WebDriver driver2) {                          //consrtuctor created automatically
		this.driver = driver2;
	}

	public WebElement enterUserName()
	{
		return driver.findElement(username);
	}

	public WebElement enterpassword()
	{
		return driver.findElement(passsword);
	}
	
	public WebElement clickOnLogIn ()
	{
		return driver.findElement(LogIn);
		
	}
	
	
}
