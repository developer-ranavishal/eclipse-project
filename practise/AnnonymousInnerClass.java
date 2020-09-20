package practise;

class Animal
{
	void sound()
	{
		System.out.println(" tiger sound ");
	}
	void children(String c)
	{
		System.out.println("have children "+c);
	}
}
/*class Zebra extends Animal
{
	@Override
      void sound()
	{
		System.out.println(" zebra sound ");
	}
	
	
}   */
interface Parent
{
	void tellmarks();
}


/*class Childdemo implements Parent
{
	@Override
	public void tellmarks() {
		System.out.println("hello my marks is 80%");
		
	}
}  */
public class AnnonymousInnerClass {

	public static void main(String[] args) {
	

		Animal z=new Animal()
				{
			        @Override
			        void sound() {
			        	System.out.println("zebra sound");
			        }
			       
				};
				 z.sound();
				 System.out.println(z.getClass().getName());
				Parent c=new Parent()
						{
					@Override
					public void tellmarks() {
						System.out.println("hello my marks is 67%");
						
					}
	                      			
						};
				
				 c.tellmarks();
				 System.out.println(c.getClass().getName());
				
		
	

	}

}
