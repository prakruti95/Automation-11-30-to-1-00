package com.a281;

import java.util.Scanner;

class Shape
{
	Scanner sc = new Scanner(System.in);
	int radius=5,a=6,b=7;
	void a()
	{
		System.out.println("Enter Radius");
		 radius = sc.nextInt();
		
		System.out.println("Enter A");
		 a = sc.nextInt();
		
		System.out.println("Enter B");
		 b = sc.nextInt();
	}
	
	
	
	
//	void getdata(int radius,int a,int b)
//	{
//		
//		
//		this.radius = radius;
//		this.a = a;
//		this.b= b;
//
//	}
}
class Circle extends Shape
{
	void area()
	{
		double ans = 3.14*radius*radius;
		System.out.println(ans);
	}
}
class Rec extends Shape
{
	void area()
	{
		double ans = a*b;
		System.out.println(ans);
	}
} 
class Tri extends Shape
{
	void area()
	{
		double ans = 0.5*a*b;
		System.out.println(ans);
	}
}

public class HierarchicalEx2 
{
	public static void main(String[] args) 
	{
		
		Shape s = new Shape();
		s.a();
		
		Circle c = new Circle();
		Rec r = new Rec();
		Tri t = new Tri();
		
		
		
//		c.getdata(5, 6, 7);
//		r.getdata(5,6,7);
//		t.getdata(5,6,7);
//		
		c.area();
		r.area();
		t.area();
	}
}
