package com.a301;

public class StringEx3 
{
	public static void main(String[] args)
	{
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = new String("saurav");
		String s4 = new String("sachin");
		String s5 = "SACHIN";
		String s6 = "milind";
		
		//equals
		System.out.println("--------------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s4));
		
		//equalsignorecase
		System.out.println("--------------------------");
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
		//==
		System.out.println("--------------------------");
		System.out.println(s1==s4);
		
		//compareTo
		System.out.println("--------------------------");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s6));
		
	
		
		
		
		
		
	}
}
