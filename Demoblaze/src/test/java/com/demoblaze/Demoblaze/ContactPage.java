package com.demoblaze.Demoblaze;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage 
{
	WebDriver driver = MyConnection.getDriver();

	public void contactTest() throws Exception 
	{
		String filepath = "D:\\Demoblaze.xlsx";

		File file = new File(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("contact");

		int rows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rows; i++) 
		{
			Row row = sheet.getRow(i);

			// skip empty rows
			if (row == null || row.getCell(0) == null) 
				continue;

			String keyword = row.getCell(0).toString().trim();
			String data = row.getCell(1).toString().trim();

		
			if (keyword.equalsIgnoreCase("Enter Email")) 
			{
				driver.findElement(By.linkText("Contact")).click();
				Thread.sleep(2000);

				driver.findElement(By.id("recipient-email")).clear();
				driver.findElement(By.id("recipient-email")).sendKeys(data);
			}

			else if (keyword.equalsIgnoreCase("Enter Name")) 
			{
				driver.findElement(By.id("recipient-name")).clear();
				driver.findElement(By.id("recipient-name")).sendKeys(data);
			}

			else if (keyword.equalsIgnoreCase("Enter Message")) 
			{
				driver.findElement(By.id("message-text")).clear();
				driver.findElement(By.id("message-text")).sendKeys(data);
				
			
			}
			else if (keyword.equalsIgnoreCase("Click Submit")) 
			{
				driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
				Thread.sleep(2000);

				// ✅ HANDLE ALERT
				try 
				{
					Alert alert = driver.switchTo().alert();
					System.out.println("Alert Message: " + alert.getText());
					alert.accept();
				} 
				catch (Exception e) 
				{
					System.out.println("No alert present");
				}
			}

			Thread.sleep(1500);
		}

		workbook.close();
	}
}


//driver.findElement(By.xpath("//button[text()='Sign up']")).click();
//Thread.sleep(2000);
//
//// ✅ HANDLE ALERT
//try 
//{
//	Alert alert = driver.switchTo().alert();
//	System.out.println("Alert Message: " + alert.getText());
//	alert.accept();
//} 
//catch (Exception e) 
//{
//	System.out.println("No alert present");
//}