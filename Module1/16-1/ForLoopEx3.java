package com.a161;

import java.util.Scanner;

public class ForLoopEx3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int ans = num*i;
			System.out.println(num+" * "+i+" = "+ans);
		}
		
		
		

	}
}
