package com.a211;

public class CopyEx 
{
	String n;
	
	CopyEx(String name) 
	{
		n = name;
	}
	//copy
	CopyEx(CopyEx c)
	{
		System.out.println(c.n);
	}
	public static void main(String[] args) 
	{
		CopyEx c1 = new CopyEx("tops");
		CopyEx c2 = new CopyEx(c1);
	}
}
