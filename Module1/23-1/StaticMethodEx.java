package com.a231;

public class StaticMethodEx 
{
	static void display()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hii");
		//StaticMethodEx s1 = new StaticMethodEx();
		display();
	}
}
