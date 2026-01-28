package com.a281;

 class J
{
	void j()
	{
		
	}
	 //abstract void j1();
}
abstract class K
{
	void k()
	{
		
	}
	abstract void k1();
}
class L extends K
{

	@Override
	void k1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractclassEx 
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		//K k1 = new K();
		L l1 = new L();
		l1.k1();
	}
}
