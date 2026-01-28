package com.a281;

//Method Overloading : When two or more methods having a same name but number 
//of parameters are diffrent

//Method Overriding : When two or more methods having a same name and number 
//of parameters are also same


public class OverloadingEx 
{
	static int cal(int a,int b)
	{
		return a+b;
	}
	static double cal(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		//OverloadingEx o1 = new OverloadingEx();
		System.out.println(cal(5,6));
		System.out.println(cal(5.00,6.00));
	}
}
