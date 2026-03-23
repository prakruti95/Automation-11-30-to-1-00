package com.junit.JuNitEx;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationDemo 
{
	
	@Test
	public void test1()
	{
		System.out.println("running test1..");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("running test2..");
	}
	
	@Test
	public void test3()
	{
		System.out.println("running test3..");
	}
	
	@Before
	public void beforetest()
	{
		System.out.println("running before test...");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("running after test");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("running before class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("runinng after class");
	}
}
