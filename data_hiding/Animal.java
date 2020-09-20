package data_hiding;
abstract public class Animal 
{
	int a,b;
	static int s;
	void animal()
	{
		a=a*b;
		System.out.println(a);
	}
      abstract void sound();
      {
    	  a=12;b=34;
    	  s=12;
    	
    	  
      }
      static
      {
    	
    	 
      }
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("cat sound is very low ");
	}
}