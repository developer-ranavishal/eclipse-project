package practise;

public class Democlass {
	
	public static void main(String[] args) {
		
		Outerdemo o=new Outerdemo();
		Outerdemo.Innerdemo i=o.new Innerdemo();
		o.outer();
		i.inner();		
	}
	
	
	}


class Outerdemo 
{
	void outer()
	{
		System.out.println("hello outer class");
		Innerdemo i=new Innerdemo();
		i.inner();
		
	}
	class Innerdemo
	{
		void inner()
		{
			System.out.println("hello inner class");
		}
	}
	
}
