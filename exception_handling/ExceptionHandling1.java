//our catch default throw && our catch our throw
package exception_handling;
import java.lang.*;
import java.util.Scanner;
public class ExceptionHandling1 
{
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the balance :");
	  int balance=sc.nextInt();
	  System.out.println("enter the withdrawl:");
	  int withdrawl=sc.nextInt();
	  System.out.print("balance amount is :"+balance);
	  System.out.println();
	  System.out.print("withdrawl amount is: "+withdrawl);
	  System.out.println();
	  try
	  {
	   if(withdrawl>balance)
		   throw new  ArithmeticException("insufficient balance:");   
	   System.out.println("you can withdrawl:");
	   balance-=withdrawl;
	   System.out.println("new balance is "+balance);
	   
	  }	
	  catch(ArithmeticException e)
	  {
		  System.out.println("oh! sorry: "+e.getMessage());
		
	  }
	 
	  finally
	  {
		  System.out.println("visited again:");
		  System.out.println("thankyou :");
	  }
	  
	
	
}
}
