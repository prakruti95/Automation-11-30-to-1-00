package com.a161;

import java.util.Scanner;

public class BiggestDigitEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max =0;//4
		
		while(num>0)
		{
			int rem = num%10;//4//3//2//1
			
			if(max<rem)
			{
				max=rem;
			}
			
			num=num/10;
		}
		
		System.out.println("Biggest Digit is: "+max);
	}
}
