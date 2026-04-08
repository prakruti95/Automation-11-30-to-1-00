package com.demoblaze.Demoblaze;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage 
{
	WebDriver driver = MyConnection.getDriver();

	public void signupTest() throws Exception 
	{
		String filepath = "D:\\Demoblaze.xlsx";

		File file = new File(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("signup");

		int rows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rows; i++) 
		{
			Row row = sheet.getRow(i);

			// skip empty rows
			if (row == null || row.getCell(0) == null) 
				continue;

			String keyword = row.getCell(0).toString().trim();
			String data = row.getCell(1).toString().trim();

			// ✅ OPEN POPUP FOR EVERY NEW USER
			if (keyword.equalsIgnoreCase("Username")) 
			{
				driver.findElement(By.id("signin2")).click();
				Thread.sleep(2000);

				driver.findElement(By.id("sign-username")).clear();
				driver.findElement(By.id("sign-username")).sendKeys(data);
			}

			else if (keyword.equalsIgnoreCase("Password")) 
			{
				driver.findElement(By.id("sign-password")).clear();
				driver.findElement(By.id("sign-password")).sendKeys(data);
			}

			else if (keyword.equalsIgnoreCase("Click Signup")) 
			{
				driver.findElement(By.xpath("//button[text()='Sign up']")).click();
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