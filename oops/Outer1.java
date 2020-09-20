package oops;

public class Outer1
{ 
	int x=12;
	static int f=23;

	void print()
	{
		System.out.println("this is outer class");
	}
	class inner1
	{
		void add()
		{
			System.out.println("this is inner class");
			x+=2;
			System.out.println("print x in inner :"+x);		
		}
		 	
	}
	static class inners
	{
		inners()
		{
			System.out.println("this is static inner class :");
		}
		void show()
		{
			System.out.println("value of f :"+f);
		}
	}

}

class Access extends Outer1.inners
{
	Access()
	{
		System.out.println("this is Access class ok:");
	}
}  









