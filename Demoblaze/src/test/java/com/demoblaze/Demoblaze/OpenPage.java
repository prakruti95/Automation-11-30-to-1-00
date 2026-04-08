package com.demoblaze.Demoblaze;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenPage 
{
	WebDriver driver = null;
	
	@DataProvider(name = "open")
	public static Object[][] readExcel() throws InvalidFormatException, IOException {
		

		String filepath = "D:\\Demoblaze.xlsx"; // only string form path

		File file = new File(filepath); // to make an file

		XSSFWorkbook workbook = new XSSFWorkbook(file);// to open the excel file

		Sheet sheet = workbook.getSheet("open");// to open the perticular sheet
		int rows = sheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[rows][2];
		
		for (int i = 0; i < rows; i++) 
		{
			Row row = sheet.getRow(i);
			data[i][0] = row.getCell(0).toString();
			data[i][1] = row.getCell(1).toString();
		}
		
		return data;
	}
	@Test(dataProvider = "open")
	public void test(String keyword, String data) throws Exception 
	{
		if (keyword.equalsIgnoreCase("enter url")) 
		{
			driver = MyConnection.connect(data);
			Thread.sleep(2000);
		}
		else if (keyword.equalsIgnoreCase("home") && data.equalsIgnoreCase("click"))
		{
			driver.findElement(By.linkText("Home")).click();
			Thread.sleep(2000);
		}
//		else if (keyword.equalsIgnoreCase("Signup")) 
//		{
//			
//			SignupPage signup = new SignupPage();
//			signup.signupTest();
//		}
		else if (keyword.equalsIgnoreCase("Login")) 
		{
			LoginPage login = new LoginPage();
			login.loginTest();
		}
//		else if (keyword.equalsIgnoreCase("Cart")) 
//		{
//			CartPage cart = new CartPage();
//			//cart.cartFlow();
//		}
	}
}