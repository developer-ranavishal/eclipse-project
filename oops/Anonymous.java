package oops;
interface  India
{
	void state();
	
}
public class Anonymous 
{
	
	
	public static void main(String[] args) 
	{
		 India i =new India()
		{
			public void state()
			{
				System.out.println("staying in saharanpur/up in interface");
			}
		};
		i.state();
		
		
	}

}
