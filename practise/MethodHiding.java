package practise;
//this is method hiding program
//method resolution is decided on compile time based on reference type
//durga sir video method hiding 
public class MethodHiding
{
	public static void main(String[] args) {
		
		Parent1 p=new Parent1();
		p.message();//hello parent    // hello parent
		Child1 c=new Child1();//hello child  // hello child
		c.message();
		Parent1 p1=new Child1();//hello child //hello parent
		p1.message();
		
		
	}

}
class Parent1
{
	 public static void message()
	 {
		 System.out.println("hello parent");
	 }
}

class Child1 extends Parent1
{
	public static void message()
	{
		System.out.println("hello child");
	}
}


