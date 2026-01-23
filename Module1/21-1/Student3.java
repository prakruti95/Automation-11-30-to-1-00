package com.a211;

//classname objname = new classname();

public class Student3 
{
	//data memebers
		int id;
		String name;
		String surname;
		String email;
		String pass;
		String num;
		
		public Student3(int i,String n,String s,String e,String p,String n1) 
		{
			id = i;
			name = n;
			surname = s;
			email = e;
			pass = p;
			num = n1;
		}
	
	//method create	
	void display()
	{
		System.out.println(id+" "+name+" "+surname+" "+email+" "+pass+" "+num);
	}
		
	
	public static void main(String[] args)
	{
		//object creation
		Student3 s1 = new Student3(101,"a","a","a@","1","1");
		Student3 s2 = new Student3(102,"a","a","a@","1","1");
		Student3 s3 = new Student3(103,"a","a","a@","1","1");
		Student3 s4 = new Student3(104,"a","a","a@","1","1");
		Student3 s5 = new Student3(105,"a","a","a@","1","1");
		
		//assign value to data member
//		s1.id=101;
//		s1.name="test";
//		s1.surname="abcd";
//		s1.email="a@gmail.com";
//		s1.pass="1234";
//		s1.num="111111";
//		
//		s2.id=102;
//		s2.name="test2";
//		s2.surname="abcd2";
//		s2.email="a2@gmail.com";
//		s2.pass="12342";
//		
//		
//		s3.id=102;
//		s3.name="test2";
//		s3.surname="abcd2";
//		s3.email="a2@gmail.com";
//		s3.pass="12342";
//		
//		
//		s4.id=102;
//		s4.name="test2";
//		s4.surname="abcd2";
//		s4.email="a2@gmail.com";
//		s4.pass="12342";
//		
//		
//		s5.id=102;
//		s5.name="test2";
//		s5.surname="abcd2";
//		s5.email="a2@gmail.com";
//		s5.pass="12342";
//		
		//print value
//		System.out.println(s1.id+" "+s1.name+" "+s1.surname+" "+s1.email+" "+s1.pass);
//		System.out.println(s2.id+" "+s2.name+" "+s2.surname+" "+s2.email+" "+s2.pass);
//		System.out.println(s3.id+" "+s3.name+" "+s3.surname+" "+s3.email+" "+s3.pass);
//		System.out.println(s4.id+" "+s4.name+" "+s4.surname+" "+s4.email+" "+s4.pass);
//		System.out.println(s5.id+" "+s5.name+" "+s5.surname+" "+s5.email+" "+s5.pass);
		
		//method call
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		
	}
}
