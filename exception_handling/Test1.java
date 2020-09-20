package exception_handling;

public class Test1 
{
	public static void main(String[] args)
	{
		int x=12,y=0;
		try
		{	
			System.out.println("hello do divide");
			x=x/y;
			System.out.println("x is "+x);
		}
		catch (ArithmeticException e) 
		{
			
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("end of the program:");
		}
		System.out.println("hey man what are you doing in a lockdown");	
		try
		{
		String s= null;
		System.out.println(s.length());
		} 
		catch (NullPointerException e) 
		{
			System.out.println("e.getMessage()");
		}
		 
	}
	





} 
	
	    
  
	


