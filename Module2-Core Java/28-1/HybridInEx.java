package com.a281;

class P
{
	void p()
	{
		System.out.println("P called");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q called");
	}
}
interface R 
{
	void r();
	
}
class S extends Q implements R
{
	void s()
	{
		System.out.println("S called");
	}

	@Override
	public void r() 
	{
		System.out.println("R called");
		
	}
}

public class HybridInEx 
{
	public static void main(String[] args) {
		
		S s = new S();
		
		s.p();
		s.q();
		s.r();
		s.s();
	}
}
