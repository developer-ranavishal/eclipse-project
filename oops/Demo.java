package oops;

public class Demo 
{
	public static void main(String[] args) 
	{
	  Outer1 o=new Outer1();
	  o.print();
	  Outer1.inner1 obj=o.new inner1();
	  obj.add();
	  Outer1.inners is=new Outer1.inners();
	  is.show();
	  Access a=new Access();
	  a.show();
	  System.out.println("noew interface come in picture");
	  Basic de=new Basic();
	  de.main();
	  de.display();
	  
	}
}
