package com.a22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx2 
{
	public static void main(String[] args) throws IOException
	{
		
		
		FileReader fr = new FileReader("E://a.txt");
		int i=0;
		
		while((i=fr.read())!=-1) 
		{
			System.out.print((char)i);
		}
		fr.close();
		
		
	}
}
