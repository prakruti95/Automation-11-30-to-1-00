package com.a22;

import java.io.Serializable;

class student implements Serializable
{
	int id;
	String name;
	
	public student(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
}