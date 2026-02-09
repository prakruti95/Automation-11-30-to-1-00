package com.a191;

import java.util.Scanner;

public class ArrayEx5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		int marks[] = new int[5];
		int total = 0;
		for(int i=0;i<5;i++)
		{
			marks[i] = sc.nextInt();
			total += marks[i];
		}
		System.out.println("Total is : "+total);
		double per = total/5;
		System.out.println(per);
		
		
		
		
	}
}
