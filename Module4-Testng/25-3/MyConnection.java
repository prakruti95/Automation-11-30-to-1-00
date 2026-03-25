package com.testngex.topstech;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyConnection 
{
	static WebDriver driver;
	
	public static WebDriver connect(String url)
	{
		//145
		//System.setProperty("webdriver.chrome.driver", "F:\\New\\New2\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//127
		//System.setProperty("webdriver.chrome.driver", "F:\\chrome-127\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//146
		System.setProperty("webdriver.chrome.driver", "F:\\chrome-146\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
