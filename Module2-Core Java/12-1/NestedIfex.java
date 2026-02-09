package com.a121;

public class NestedIfex 
{
	public static void main(String[] args)
	{
		int age = 78;
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			if(age>=60)//nested if
			{
				System.out.println("Senior Citizen");
			}
			else
			{
				System.out.println("Young Age");
			}
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}
}
