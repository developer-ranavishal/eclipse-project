package enumrated_datatype;
public class AnnotationDemo 
{
	 @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	 
		Child c=new Child();
		c.turn();
		
	}
}

class Parent 
{
	public void get()
	{
		System.out.println("hello in Parent");
	}
}
class Child extends Parent
{
	@Override
	public void get()
	{
		System.out.println("hello in Child");
		}
	@Deprecated
	void turn()
	{
		System.out.println("don't use this method ");
	}
	
}
