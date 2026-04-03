package com.demoblaze.Demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage 
{
	
	public void homepage()
	{
		for(int i=0;i<3;i++)
		{
			MyConnection.driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[2]")).click();
		}
		
	}
	
}
