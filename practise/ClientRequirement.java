package practise;

import java.util.Scanner;

public interface ClientRequirement
{
   int add();
   int sub();
   int div();
   int mul();
   static void message()
   {
	   System.out.println("my company is selling garments");
   }
   default void message1()
   {
	   System.out.println("we want this software in 1 week :");
   }
}
abstract class ServiceProvider implements ClientRequirement	
{
	public int add()
	{
		message1();
		System.out.println("you can add two product amount");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product 1 amount");
		int am1=sc.nextInt();
		System.out.println("enter product 2 amount");
		int am2=sc.nextInt();
		
		return am1+am2;
		}
	public int sub()
	{
		System.out.println("you can substract two product amount");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product 1 amount");
		int am1=sc.nextInt();
		System.out.println("enter product 2 amount");
		int am2=sc.nextInt();
		
		return am1-am2;
		}

}
 
