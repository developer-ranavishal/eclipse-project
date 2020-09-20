package oops;

public class Outer 
{
  static int f=12;
	void fo()
	{
		f=f+1;
		System.out.println("f="+f);
		
	}
	static int x=12;
	static class Inner
	{
		
	   void fs()
	   {
		   System.out.println("static inner class function");
		   System.out.println("x="+x);
		   System.out.println("f="+f);
	   }
	}
	class Inner1
	{


		
	   void fns()
	   {
		   System.out.println("simple inner class");
		   System.out.println("f="+f);
	   }
	}

}
