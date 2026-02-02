package com.a22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2 
{
	public static void main(String[] args) throws Exception
	{
		
		
			String s = "welcome to tops";
			FileOutputStream fout = new FileOutputStream("E://tops.txt");
			fout.write(s.getBytes());
			System.out.println("Success");
			fout.close();
			
			FileInputStream fin = new FileInputStream("E://tops.txt");
		
			int i=0;
			
			while((i=fin.read())!=-1) 
			{
				System.out.print((char)i);
			}
	}
}
