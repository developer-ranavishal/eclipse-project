package practise;

import java.util.Scanner;

public class Demo2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[][];
		ar=new int[2][2];
		for(int i=0;i<ar.length;i++)	   
          	for (int j=0; j < ar.length; j++) 
			{
				System.out.println("enter the row "+i+" and col "+j);
				ar[i][j]=sc.nextInt();
			}
		System.out.println("printing array element");
		for(int i=0;i<ar.length;i++)
		{
			 for(int j=0;j<ar.length;j++)
			{
				System.out.print("ar["+i+"]["+j+"]= "+ar[i][j]);
				System.out.print(" ");
			}  
			 
			 System.out.println();
			
		} 
			

		
		
		
	}
}
