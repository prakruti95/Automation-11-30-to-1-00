package com.a281;


class RBI1
{
	int rate()
	{
		return 0;
	}
}
class SBI1 extends RBI1
{
	int rate()
	{
		return 7;
	}
}
class ICICI1 extends RBI1
{
	int rate()
	{
		return 8;
	}
}
class AXIS1 extends RBI1
{
	int rate()
	{
		return 9;
	}
}


public class OverridingEx 
{
	public static void main(String[] args) 
	{
		RBI1 r; //refrence variable
		
		r = new SBI1();
		System.out.println(r.rate());
		
		r = new ICICI1();
		System.out.println(r.rate());
		
		r = new AXIS1();
		System.out.println(r.rate());
		
		
	}
}
