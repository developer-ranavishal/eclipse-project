package practise;

public class Final 
{
	static int r=12;
	final int a=12;
	final static int b=13;
	float f;
	static void  print(int k)
	{ 
		
		//System.out.println(a);
		System.out.println(b);
		System.out.println(k);
	}
	 
	public static void main(String[] args) {
		
		new Final();
		print(2);
		
	}
}
class Dem extends Final
{
	static void print(int k)
	{
		
	}
	
}
