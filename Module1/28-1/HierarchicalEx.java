package com.a281;

class RBI
{
	int rate=6;
}
class SBI extends RBI
{
	int rate()
	{
		return 1;
	}
}
class ICICI extends RBI
{
	int rate()
	{
		return 2;
	}
}
class AXIS extends RBI
{
	int rate()
	{
		return 3;
	}
}

public class HierarchicalEx 
{
	public static void main(String[] args) 
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		int data = s.rate+s.rate();
		System.out.println(data);
		
		
//		System.out.println(s.rate);
//		System.out.println(s.rate());
//		System.out.println(i.rate());
//		System.out.println(a.rate());
	}
}
