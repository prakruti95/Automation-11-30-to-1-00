package com.a211;

//classname objname = new classname();

public class Student 
{
	//data memebers
		int id;
		String name;
	
	public static void main(String[] args)
	{
		//object creation
		Student s1 = new Student();
		Student s2 = new Student();
		
		//assign value to data member
		s1.id=101;
		s1.name="test";
		
		s2.id=102;
		s2.name="test2";
		
		//print value
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
		
	}
}
