package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.signUpPageObject;
import resources.baseClass;

public class verifySignUp extends baseClass {

	@Test
	
	public void signUp() throws IOException, InterruptedException{
		
		driverInitialize();
		Thread.sleep(1000);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		signUpPageObject spg=new signUpPageObject(driver);
	 
	    	spg.enterfs().sendKeys("vishal");
	   	   spg.enterls().sendKeys("Nagare");
	   	   
		   spg.entreEmail().sendKeys("Vishal@gmail.com");
		     Thread.sleep(2000);
		     
		     Select selectJobTitle= new Select( spg.selectJobTitle());
		      selectJobTitle.selectByIndex(8);
		      Thread.sleep(2000);
		     selectJobTitle.selectByValue("Marketing_PR_Manager_ANZ");
		     Thread.sleep(2000);
		     selectJobTitle.selectByVisibleText("Sales Manager");
		     Thread.sleep(2000);
		     
		     spg.entreCompany().sendKeys("TCS");
		     Thread.sleep(2000);
		     
		     
		     Select selectEmployees=new Select( spg.selectNumbersOfEmployees());
		     selectEmployees.selectByIndex(2);
		     Thread.sleep(2000);
		     
		     selectEmployees.selectByValue("1001");
		     Thread.sleep(2000);
		     
		     selectEmployees.selectByVisibleText("2001+ employees");
		     Thread.sleep(2000);
		     
		     spg.entrePhone().sendKeys("9112907549");
		     Thread.sleep(2000);
		     
		     
		     Select selectCountry=new Select( spg.selectCountry());
		     selectCountry.selectByIndex(3);
		     Thread.sleep(2000);
		     
		     selectCountry.selectByVisibleText("India");
		     Thread.sleep(2000);

	  
	  
	}
}
