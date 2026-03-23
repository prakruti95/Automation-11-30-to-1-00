package com.testngex.topstech;


import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNG_Dependence 
{
	WebDriver driver=null;
	
	
	@Test
	public void beforetest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\chrome-146\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = {"beforetest"})
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
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
	@Test(dependsOnMethods = {"login"})
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = {"signout"})
	public void aftertest()
	{
		driver.close();
	}
}
