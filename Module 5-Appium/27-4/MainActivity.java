package com.generalstore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MainActivity 
{
	
	
	void screen1() throws InterruptedException, MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		//cap.setCapability("appPackage","com.androidsample.generalstore");
		
		cap.setCapability("appActivity","com.androidsample.generalstore.MainActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Albania']")).click();
		
		Thread.sleep(2000);
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Arun");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();		 
		 Thread.sleep(2000);
		
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 
	
		 //Scroll
//		 
//		 driver.findElement(
//				    AppiumBy.androidUIAutomator(
//				            "new UiScrollable(new UiSelector().scrollable(true))" +
//				            ".scrollIntoView(new UiSelector().text(\"Albania\"));"
//				    )
//				).click();
		 
		 	CartActivity a = new CartActivity();
			a.screen2();
			
	}
	

}