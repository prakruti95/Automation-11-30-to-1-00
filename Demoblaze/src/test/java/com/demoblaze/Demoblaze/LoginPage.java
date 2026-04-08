package com.demoblaze.Demoblaze;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver = MyConnection.getDriver();

	public void loginTest() throws Exception 
	{
		String filepath = "D:\\Demoblaze.xlsx";

		File file = new File(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("login");

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
				driver.findElement(By.id("login2")).click();
				Thread.sleep(2000);

				driver.findElement(By.id("loginusername")).clear();
				driver.findElement(By.id("loginusername")).sendKeys(data);
			}

			else if (keyword.equalsIgnoreCase("Password")) 
			{
				driver.findElement(By.id("loginpassword")).clear();
				driver.findElement(By.id("loginpassword")).sendKeys(data);
			}

			else if (keyword.equalsIgnoreCase("Click Signup")) 
			{
				driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
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