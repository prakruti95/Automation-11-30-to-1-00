package com.data1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.data1.MyConnection;

public class S5_fb_Registration 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", "F:\\New\\New2\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.facebook.com");
		
		WebDriver driver = MyConnection.connect("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("prakruti");
		driver.findElement(By.name("lastname")).sendKeys("vyas");
		
		//driver.findElement(By.id("day")).sendKeys("15");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("11");
		
		Thread.sleep(1000);
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Mar");
		
		Thread.sleep(1000);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1998");
		
		Thread.sleep(1000);
		
		List<WebElement>gender = driver.findElements(By.id("sex"));
		gender.get(0).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("submitdata123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Tops?12345");
		
		ScreenShotEx.getScreenShot(driver,"reg");
		
		
		//driver.findElement(By.name("websubmit")).click();
	}
}
