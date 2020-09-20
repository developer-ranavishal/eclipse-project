package practise;
public class static_block 
{
	static int age=12;
	static char c='a';
	int num=122;
	int i;
	static int in;
	
	static {
		System.out.println("static block 1");
		System.out.println("age is "+age+ ": char is "+c);
		
	}
	public static_block() {
		super();
		System.out.println("print in constructor");
	}
	static
	{
		System.out.println("static block 2");
		System.out.println("hello");
	}
	
	{
		i=13;
		System.out.println("IIB printing is "+i);
		in=112;
		System.out.println("IIB is printing "+in);
		int g=super.hashCode();
		System.out.println("hashcode is "+g);
		
		
	}
	
	public static void main(String[] args) {
		
		static_block s=new static_block(); 
	}
	

}
