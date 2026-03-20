package com.testngex.topstech;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest 
{
	@Parameters("browser")
	@Test
	public void test(String browser)
	{
		WebDriver driver=null;
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chrome-146\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			//driver.get("https://www.facebook.com");
			
		}
		else if(browser.equals("ed"))
		{
				System.setProperty("webdriver.edge.driver","F:\\edge-146\\msedgedriver.exe");
				//driver = new EdgeDriver();
				//driver.get("https://www.google.com");
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--no-proxy-server");

				 driver = new EdgeDriver(options);
				
		}
		driver.get("https://www.facebook.com");
		
		
		
		
	}
}
