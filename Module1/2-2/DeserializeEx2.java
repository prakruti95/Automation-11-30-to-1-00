package com.a22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEx2 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://myfile.txt"));
		student s = (student) in.readObject();
		System.out.println(s.id+" "+s.name);
		
	}
}
