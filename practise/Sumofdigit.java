package practise;

import java.util.Scanner;

public class Sumofdigit 
{
    public static void main(String[] args) {
		
    	int rem=0;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number ");
    	int n=sc.nextInt();
    	while(n>0)//n=121,12,1,0>0(false)
    	{
    	rem+=(n%10);//1+2+1=4>result
    	n=n/10;//12,1,0
    	
    	}
    	
    	System.out.println("sum of digit of entered numbered is "+rem);
    	
    	
    	
	}
	
}
