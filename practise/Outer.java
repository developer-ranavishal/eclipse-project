package practise;

public class Outer 
{
	void m1(int h)
	{
		System.out.println("value of h in outer "+h);
	}
	void show()
	{
		Inner in=new Inner();
	    System.out.println("in outer class method create inner call "+in.m(13));
	}

	class Inner  //regular inner class
	{
		 int f;

		String m(int k)
		{
			return ("value of k in inner class "+k);
			
		}
	
     }
public static void main(String[] args) {
		
		System.out.println("hello outer");
		/*Outer o=new Outer();
		Inner i=o.new Inner();
		i.m(12);	
		o.m1(23);  */
		Outer.Inner i=new Outer().new Inner();
		System.out.println(i.m(23));
		new Outer().show();
		
	
	
		
	}
	
}
/*
 *   without existing outer class object,
 *    you don't create/reached the inner class object
 *    Step-1 create outer class object
 *    step-2 by outer class object we can eaisly create inner class object
 * */

