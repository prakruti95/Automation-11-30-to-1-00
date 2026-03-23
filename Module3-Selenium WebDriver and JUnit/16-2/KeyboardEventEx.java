package com.data1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventEx 
{
	public static void main(String[] args) 
	{
		WebDriver driver = MyConnection.connect("https://www.google.com");
		
//		WebElement elem = 
		driver.findElement(By.name("q")).sendKeys("tops");
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ENTER).build().perform();
		
		//builder.click(elem)
		//.sendKeys("tops technologies")
		//.sendKeys(Keys.PAGE_DOWN)
		//.sendKeys(Keys.ENTER)
		//.build()
		//.perform();
	}
}
