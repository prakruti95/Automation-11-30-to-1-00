package com.a301;

public class StringBufferEx 
{
	public static void main(String[] args) 
	{
		StringBuffer sf = new StringBuffer("Hello");
		
		//sf.append(" Java");
		//System.out.println(sf);
	
//		sf.insert(1, "java");
//		System.out.println(sf);
		
//		sf.delete(1,3);
//		System.out.println(sf);
		
		
		//System.out.println(sf.reverse());
		
		sf.replace(1, 3, "Java");
		System.out.println(sf);
	}
}
