package practise;
import practise.ServiceProvider;
import java.util.*;
public class Result 
{
public static void main(String[] args) {
	
	System.out.println("hello java");
	
	
}
	
}
class ServiceProvider1 extends ServiceProvider
{
	public int mul()
	{
		System.out.println("you can  multiplication the two product amount");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product 1 amount");
		int am1=sc.nextInt();
		System.out.println("enter product 2 amount");
		int am2=sc.nextInt();
		
		return am1*am2;
		}
	public int div()
	{
		System.out.println("you can divide two product amount");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product 1 amount");
		int am1=sc.nextInt();
		System.out.println("enter product 2 amount");
		int am2=sc.nextInt();
		
		return am1/am2;
		}
	public static void main(String[] args) {
		
		ServiceProvider1 sp=new ServiceProvider1();
		System.out.println(sp.add());
		System.out.println(sp.sub());
		System.out.println(sp.mul());
		System.out.println(sp.div());
	}

	
}

