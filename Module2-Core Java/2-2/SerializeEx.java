package com.a22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEx 
{
	public static void main(String[] args) throws IOException 
	{
		student s = new student(101,"abcd");
		FileOutputStream fout = new FileOutputStream("E://myfile.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		System.out.println("Success");
		
		
	}
}
