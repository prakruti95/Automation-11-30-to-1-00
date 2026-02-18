package com.data1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollDemo 
{
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = MyConnection.connect("https://www.demoblaze.com/");
		Thread.sleep(5000);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//WebElement ele  =driver.findElement(By.linkText("Watch"));
		
		js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);
		driver.findElement(By.id("next2")).click();
		//driver.quit();
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
