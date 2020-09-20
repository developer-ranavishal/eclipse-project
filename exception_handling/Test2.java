package exception_handling;
import java.util.Scanner;

public class Test2
{
	public static void main(String[] args)
	{
		int i=1;
		do
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int x=sc.nextInt();
		System.out.println("enter the second number");
		int y=sc.nextInt();
		if(y==0) throw new ArithmeticException("hey stupid dont divide with zero");
		int z=x/y;
		System.out.println("z is "+z);
		i=2;
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
			
		}
		}while(i==1);
	
		
		
			
				
	}
}

	

