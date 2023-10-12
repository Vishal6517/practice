package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObject {
	
	public static WebDriver driver;
	
    private By fs=By.xpath("//input[@name='UserFirstName']");
    private By ls=By.xpath("//input[@name='UserLastName']");
    private By email=By.xpath("//input[@name='UserEmail']");
	private By jobTitle=By.xpath("//select[@name='UserTitle']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By phone= By.xpath("//input[@name='UserPhone']");
	private By country= By.xpath("//select[@name='CompanyCountry']");
	
	
    public signUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterfs()
    {
		return driver.findElement(fs);
    	
    }
    
    public WebElement enterls()
    {
		return driver.findElement(ls);
    
    }
    public WebElement entreEmail() {
		return driver.findElement(email);
		
		
	}
	public WebElement selectJobTitle() {
		return driver.findElement(jobTitle);
		
	}
	public WebElement entreCompany() {
		return driver.findElement(company);
		
	}
	public WebElement selectNumbersOfEmployees() {
		return driver.findElement(employees);
		
		
	}
	public WebElement entrePhone() {
		return driver.findElement(phone);
		
	}
	public WebElement selectCountry() {
		return driver.findElement(country);
		
	}

}
