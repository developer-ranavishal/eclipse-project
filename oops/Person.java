package oops;

public abstract class Person 
{
	
	void print() 
	{
		System.out.println("please using my class");
	}
	abstract void add(int a,int b);
	abstract void sub(int a,int b);
	
}
  abstract class vishal extends Person
{
	  void add(int a,int b)
		{
			System.out.println("additon is :"+(a+b));
		}
	 void run(vijay v)
	 {
		int a=12,b=2;
		v.add(a,b); 
	 }
    
	 	
}
  class vijay extends vishal
 {
	  void sub(int a,int b)
		 {
		    	 System.out.println("substraction is :"+(a-b));
			 
		 }
 }