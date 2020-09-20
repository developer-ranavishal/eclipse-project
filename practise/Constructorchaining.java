package practise;

class Test1
{
	public Test1() {
	
		System.out.println("1-parent class constructor");
	}
	public Test1(int x)
	{
		this();
		System.out.println("2-parent class constructor");
	}
	public Test1(int x,int y)
	{
		this(3);
		System.out.println("3-parent class constructor");
	}
}
class TestChild extends Test1
{ 
	public TestChild(int y) 
	{
	
		System.out.println("child class constructor");
	}
	
	public TestChild() {
		this(4);	
		System.out.println("child class constructor");
	}
}
public class Constructorchaining {

	public static void main(String[] args) {
		   
		//TestChild t=new TestChild();
		Test1 te=new Test1(3,5);
		System.out.println("so this is called constructor chaining");
		
      
	}

}
