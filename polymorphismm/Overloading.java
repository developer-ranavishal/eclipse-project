package polymorphismm;

public class Overloading 
{
      void behavior()
   {
	   System.out.println("it express behavoir call in super class");
   }
}
class Overloading1 extends Overloading 
{
	  
	 void behavior(String name)
	{
		System.out.println("behavior is rude of :"+name);
	}
}