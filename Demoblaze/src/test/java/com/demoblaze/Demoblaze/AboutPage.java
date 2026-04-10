package com.demoblaze.Demoblaze;

import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage 
{
	WebDriver driver = MyConnection.getDriver();

	public void aboutTest() throws Exception 
	{
		String filepath = "D:\\Demoblaze.xlsx";

		File file = new File(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("about");

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
			if (keyword.equalsIgnoreCase("Click Play")) 
			{
				
				driver.findElement(By.linkText("About us")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"example-video\"]/div[1]")).click();
				System.out.println("abcd");
			}
			else if(keyword.equalsIgnoreCase("Close"))
			{
				driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
			}

			
		}

		workbook.close();
	}
}