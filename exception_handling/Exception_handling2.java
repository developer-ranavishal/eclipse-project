package exception_handling;
import java.lang.*;
import java.util.Scanner;
public class Exception_handling2 
{
	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the age to play game:");
	    int age=sc.nextInt();
		try
		{
			if(age>25) throw new ArithmeticException("not eligible");
			 
		}
		
		finally
		{
			System.out.println("hello players");
		}
		if(age>=12 && age<=25)
			System.out.println("you can play game");
		if(age<12)
			System.out.println("you are children not able to play game");
	}
	
	
	
	
}

