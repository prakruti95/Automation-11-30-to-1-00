package com.a22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3 
{
	
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not valid"); 
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	
	public static void main(String[] args)
	{
		
		validate(15);
		
	}
}
