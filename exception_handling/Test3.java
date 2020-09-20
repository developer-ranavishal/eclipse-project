package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test3 
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("hey enter 1 or 0 to read or unread a file");
		int i=sc.nextInt();	
		do {
	    try
		{
			if(i==1)
		  throw new FileNotFoundException("hey buddy class not found");
		FileReader fe=new FileReader("d:/dar.txt");
		System.out.println("we have successfully read the file");
		  i++;
	    	}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("plese try again");
		}
		}while(i==1);
	}

}
