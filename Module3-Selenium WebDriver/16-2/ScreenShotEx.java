package com.data1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotEx 
{
	public static void main(String[] args) 
	{
		WebDriver driver = MyConnection.connect("https://www.facebook.com/");
		getScreenShot(driver, "err");
	}

	static void getScreenShot(WebDriver driver, String imgname) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
	
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\img\\"+imgname+".png");
	
		try
		{
			FileUtils.copyFile(source, dest);
			System.out.println("screenshot taken");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Executed");
		
	}
}
