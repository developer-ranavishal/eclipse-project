package polymorphismm;

public class Overriding 
{
  void show() 
  {
	  System.out.println("overridden in super class");
	  
  }
}
class Overriding1 extends Overriding
{
	void show()
	{
		System.out.println("overridden in sub class");
	}
}
