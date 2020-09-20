package multithreading;
import java.util.Scanner;

class Add implements Runnable
{
	public void run()
	{
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number :");
	i=sc.nextInt();
	System.out.println("enter the second number :");
	j=sc.nextInt();
	System.out.println("sum of "+i+" and "+j+" is "+(i+j));
	
	}
}

class Sub implements Runnable
{
	public void run()
	{
	int i=12,j=3;
	/* Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number :");
	i=sc.nextInt();
	System.out.println("enter the second number :");
	j=sc.nextInt();  */
	for(int k=0;k<=5;k++)
	{
	System.out.println("substraction of "+i+" and "+j+" is "+(i-j));
	i--;j++;
	}
	
	}

}
public class ExampleThread 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Add());
		t1.start();
		System.out.println(t1.getName());
		Thread t2=new Thread(new Sub());
		t2.start();
		System.out.println(t2.getName());
		
		
	}

}
