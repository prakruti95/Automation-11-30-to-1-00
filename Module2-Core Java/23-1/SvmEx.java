package com.a231;

public class SvmEx 
{
	String name;
	String surname;
	static String college="VVP";
	
	public SvmEx(String name,String surname) 
	{
		this.name=name;
		this.surname=surname;
	}
	void display()
	{
		System.out.println(name+" "+surname+" "+college);
	}
	static void change()
	{
		college = "Atmiya";
	}
	public static void main(String[] args) 
	{
		SvmEx s1 = new SvmEx("a","a");
		SvmEx s2 = new SvmEx("b","b");
		change();
		s1.display();
		s2.display();
	}
}
