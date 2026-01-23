package com.a231;

class A
{
	void a()
	{
		System.out.println("A called");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B called");
	}
}

public class SingleEx 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.a();
		b1.b();
	}
}
