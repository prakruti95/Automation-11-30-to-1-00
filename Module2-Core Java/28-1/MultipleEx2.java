package com.a281;

//interface : collection of abstract methods
//abstract method : which does not have a body part

interface print
{
	void p();
	
}
interface show
{
	void s();
}

public class MultipleEx2 implements print,show
{

	@Override
	public void s() {
		
		System.out.println("S called");
		
	}

	@Override
	public void p() {
		System.out.println("P called");
		
		
	}
	
	public static void main(String[] args) {
		
		MultipleEx2 m = new MultipleEx2();
		
		m.p();
		m.s();
	}
	
}
