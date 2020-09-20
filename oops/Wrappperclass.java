package oops;

public class Wrappperclass
{
	public static void main(String[] args) 
	{
		/* int i=23;
		Integer iw=new Integer(i);//boxing
		Integer j=++i;//auto-boxing(internally~Integer j=new Integer(++i);
		System.out.println(iw);
		String s="a";
		System.out.println(j);
		int f=Integer.valueOf(j);//unboxing
		int k=f++;//auto-unboxing	*/
		Add ad=new Add();
		ad.print();
		
	}	
}
class Add
{
	Integer i=new Integer(12);
	Integer j=13;
	void print()
	{
		System.out.println("i is "+i);
		System.out.println("j is "+j);
		System.out.println("print sum :");
		Integer sum=i+j;
		System.out.println("sum of "+i+" and "+j+"="+sum);
		Integer v=Integer.valueOf(sum);
		System.out.println("value of v="+v);
	}
	
}
