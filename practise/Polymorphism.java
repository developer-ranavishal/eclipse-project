package practise;
//this is method hiding program
//method resolution is decided on compile time based on reference type
//durga sir video method hiding 
public class Polymorphism 
{
	public static void main(String[] args) {
		
		Parent p;
		
		
	}

}
class Parentdemo2
{
	 public static void message()
	 {
		 System.out.println("hello parent");
	 }
}

class Child extends Parentdemo2
{
	public static void message()
	{
		System.out.println("hello child");
	}
}


