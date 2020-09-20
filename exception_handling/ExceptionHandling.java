//default throw our catch 
package exception_handling;
import java.lang.*;
public class ExceptionHandling
{
	public static void main(String[] args) {
		
		try 
		{   
	         String s=null;
			System.out.println("NullPointerException:");
			System.out.println(s.length());//exception
			System.out.println("divided by a number");
			}
		
		    catch (NullPointerException e)
		{   
		    	System.out.println("hey  string is "+e.getMessage());
				
			}
		try
		{
			
	
			System.out.println("ArithmeticException:");
			System.out.println(34/0);
		}
		catch (ArithmeticException e) {
		System.out.println("hey! this is "+e.getMessage());
		}
		try
		{
			
			System.out.println("ArrayaIndexOutofBoundsException:");
			int a[]=new int[5];
			a[6]=4;
			
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("hey this is "+e.getMessage());
		}
		try {
			 System.out.println("NumberFormatException:");
			 String s="rana";
			 int i=Integer.parseInt(s);
			
			 
			
		} catch (NumberFormatException e) {
			System.out.println("ha bhai kya haal ha");
			System.out.println("hey this is "+e.getMessage());
			System.out.println("ha bhai kya haal");
		}
		 	
		finally //this block will always executed after catch block exit
		 {
		System.out.println("end of program :");
		}
		
		
	}

}
