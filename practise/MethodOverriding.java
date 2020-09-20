package practise;

public class MethodOverriding {
	public static void main(String[] args) {
	   Eat1 e1=new Eat1();
      e1.taste("momos");
		Eat e=new Eat1();
		e.taste("burger");
		e1.display();
		e1.display(2);
		
			}
}
class Eat
{
	void taste(String item)
	{
		System.out.println( "taste is "+item);
		
	}
	void display()
	{
		System.out.println("set to display");
	}
	
}
class Eat1 extends Eat
{
   
	@Override
	void taste(String item) {
		// TODO Auto-generated method stub
		super.taste(item);
	}
	void display(int num)
	{
		System.out.println("hello bhai");
	}
	
}
