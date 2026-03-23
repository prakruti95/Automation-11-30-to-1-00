package com.junit.JuNitEx;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest 
{
	
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actual =  c.add(10, 40);
		int expected = 30;
		
		assertEquals(expected, actual);
	}
}
