package com.testngex.topstech;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter 
{
	WebDriver driver=null;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chrome-146\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	
	@Test
	@Parameters({"email","password"})
	public void login(String email,String password) throws InterruptedException
	{
		driver.findElement(By.name("user-name")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/"))
		{
			System.out.println("Test Failed");
			fail();
			
		}
		else
		{
			System.out.println("This test is passed..");
		}
	}
	@Test
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
}
