package com.generalstore;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CartActivity2 
{
	void screen3() throws InterruptedException, MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("appActivity","com.androidsample.generalstore.WebViewActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		
		
	}
}