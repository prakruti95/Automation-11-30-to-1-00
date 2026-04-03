package com.demoblaze.Demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyConnection 
{
	static WebDriver driver;

	public static WebDriver connect(String url) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\chrome-146\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
