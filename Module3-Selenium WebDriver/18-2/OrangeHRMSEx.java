package com.a;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.data1.MyConnection;

public class OrangeHRMSEx 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		WebDriver driver = MyConnection.connect("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(8000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		String data = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")).getText();
		System.out.println(data);
		
		if(data.equals("Dashboard"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Fail");
		}
	
	}
}
