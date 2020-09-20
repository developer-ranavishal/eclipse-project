package practise;
/* without creating the Outer class object we can 
 * create the object of inner class
 */
public class StaticInnerclass 
{
	public static void main(String[] args) {
		
		
	}

}
class Outerclass
{
	static class Innerclass
	{
		
		void m1()
		{
			System.out.println("hello this is the static inner class");
		}
		
	}
	public static void main(String[] args) {
		Outerclass o=new Outerclass();//no need to creating the outerclass object
		Innerclass in=new Innerclass();
		in.m1();
	}
	
}
