package com.a161;

import java.util.Scanner;

public class SumofAllDigitsEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		
		while(num>0)
		{
			int rem = num%10;
			sum+=rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits are: "+sum);
	}
}
