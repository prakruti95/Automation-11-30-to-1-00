package com.testngex.topstech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest {
	
	@Parameters({"uname","pass"})
	@Test
	public void login(String username, String password)
	{
		WebDriver driver = MyConnection.connect("https://www.facebook.com/");
		WebElement u =  driver.findElement(By.name("email"));
		u.clear();
		u.sendKeys(username);
		WebElement p =  driver.findElement(By.name("pass"));
		p.clear();
		p.sendKeys(password);
	}
}
