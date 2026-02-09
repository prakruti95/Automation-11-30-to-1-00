package com.a191;

public class PatternEx5 
{
	public static void main(String[] args) 
	{
		int num = 65;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)num);
				//ch++;
			}
			num++;
			System.out.println();
		}
	}
}
