package com.data1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = MyConnection.connect("https://demoqa.com/");
		WebDriverWait wait = new WebDriverWait(driver,30);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	   
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/a[3]/div/div/div[3]/h5")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/a[@href=\"/alerts\"]")).click();
		Thread.sleep(2000);
		
		
		
		//1st Normal Alert
		
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(1000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		//2nd Alert Button
//		driver.findElement(By.id("timerAlertButton")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(1000);
//		System.out.println(alert.getText());
//		alert.accept();
		
		//3rd Alert Button
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(1000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		//alert.accept();
//		alert.dismiss();

		//4th Alert Button
//		driver.findElement(By.id("promtButton")).click();
//		Thread.sleep(1000);
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Tops Tech");
//		alert.accept();
		
	}
}
