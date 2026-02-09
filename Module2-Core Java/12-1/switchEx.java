package com.a121;

import java.util.Scanner;

public class switchEx 
{
	public static void main(String[] args) 
	{
		//int num=2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1:System.out.println("Language is English");
			break;
			
			case 2:System.out.println("Language is Hindi");
			break;
			
			case 3:System.out.println("Language is Gujarati");
			break;
		}
	}
}
