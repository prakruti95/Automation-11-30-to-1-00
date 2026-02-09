package com.a211;

public class ParaEx 
{
	int i;
	String n;
	
	public ParaEx(int id,String name) 
	{
		i = id;
		n = name;
	}
	
	void display()
	{
		System.out.println(i+" "+n);
	}
	public static void main(String[] args) 
	{
		ParaEx p1 = new ParaEx(101, "abcd");
		ParaEx p2 = new ParaEx(102, "pqrs");
		
		p1.display();
		p2.display();
	}
}
