package com.a231;

//this keyword will use for refrence passing

public class ThisEx 
{
	int id;
	String name;
	
	public ThisEx(int id,String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		ThisEx p1 = new ThisEx(101, "abcd");
		ThisEx p2 = new ThisEx(102, "pqrs");
		
		p1.display();
		p2.display();
	}
}
