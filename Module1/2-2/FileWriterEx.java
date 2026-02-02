package com.a22;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("E://a.txt");
		fw.write("Hello");
		fw.close();
		System.out.println("Success");
		
	}
}
