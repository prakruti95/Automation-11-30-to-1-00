package com.a161;

import java.util.Scanner;

public class FirstandLastDigitEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int fdigit=0,ldigit=0;
		
		ldigit = num%10;
		
		while(num>0)
		{
			if(num>9)
			{
				num=num/10;
			}
			else
			{
				fdigit = num;
				num=num/10;
				
			}
		}
		
		int ans = fdigit+ldigit;
		System.out.println(ans);
		
		
		
	}
}
