package com.generalstore;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CartActivity 
{
	void screen2() throws InterruptedException, MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("appActivity","com.androidsample.generalstore.CartActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
	
		CartActivity2 a = new CartActivity2();
		a.screen3();
	
		 //Scroll
//		 
//		 driver.findElement(
//				    AppiumBy.androidUIAutomator(
//				            "new UiScrollable(new UiSelector().scrollable(true))" +
//				            ".scrollIntoView(new UiSelector().text(\"Albania\"));"
//				    )
//				).click();
	}
}