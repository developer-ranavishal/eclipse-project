package multithreading;
import java.util.Scanner;
class Swap extends Thread
{
   Scanner sc=new Scanner(System.in);
    @Override
    	public void run() 
        {
    	    System.out.println("running thread is "+Thread.currentThread().getName());
    	    System.out.println("thread priority is "+Thread.currentThread().getPriority());
    		/* System.out.println("enter the  vale of a swap");
    		int a=sc.nextInt();
    		System.out.println("enter the value  of b swap");
    		int b=sc.nextInt();   */
    	    int a=2,b=6;
    		a=a+b;//a=2 b=4 a=6
    		b=a-b;//b=2
    		a=a-b;//a=4
    		System.out.println("value of a="+a);
    		System.out.println("value of b="+b);
    		
    	}
}
class Check extends Thread
{
   Scanner sc=new Scanner(System.in);
    @Override
    	public void run() 
        {
    	  System.out.println("running thread is "+Thread.currentThread().getName());
    	  System.out.println("thread priority is "+Thread.currentThread().getPriority());
    		/* System.out.println("enter the number 1 of check");
    		int a=sc.nextInt();
    		System.out.println("enter the number 2 of check");
    		int b=sc.nextInt(); */
    	  int a=12,b=3;
    		if(a>b) 
    			System.out.println("a is greater");
    		else
    			System.out.println("b is greater");
    		
    	}
}
public class ExampleThread1 
{
	public static void main(String[] args) {
	
		Swap s=new Swap();
		Check c=new Check();
		s.setPriority(Swap.MAX_PRIORITY);
		c.setPriority(8);
		s.start();
		c.start();
	}

}
