package com.testngex.topstech;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoTestListener implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed...");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed...");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished...");
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started...");
	}
	
}
