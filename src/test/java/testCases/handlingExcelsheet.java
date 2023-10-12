package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingExcelsheet {

	@Test
	
	public void excelSheet() throws IOException, InterruptedException
	{
		FileInputStream fs = new FileInputStream("D:\\aa.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);   //create workbook
		
		XSSFSheet sheet=workbook.getSheetAt(0);         //select sheet in the excelsheet
		
		XSSFRow row = sheet.getRow(0);                  //select row
		
		XSSFCell c1 =row.getCell(0);                     //select column in which email id stored
	    XSSFCell c2 =row.getCell(1);                      //select column in which password stored
		
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement ID = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		ID.click();
		ID.sendKeys(c1.getStringCellValue());                                           //entering value
		
		WebElement pw = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pw.click();
		pw.sendKeys(c2.getStringCellValue());
	}
}
