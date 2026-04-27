package com.generalstore;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SplashScreenActivity 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		cap.setCapability("appPackage","com.androidsample.generalstore");
		
		cap.setCapability("appActivity","com.androidsample.generalstore.SplashActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		Thread.sleep(3000);
		
		MainActivity a = new MainActivity();
		a.screen1();
		
		
	}
}