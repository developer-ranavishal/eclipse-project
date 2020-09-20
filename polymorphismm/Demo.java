package polymorphismm;

public class Demo 
{
  public static void main(String[] args) {
	  Overloading1 o=new Overloading1();
	  Overriding ov=new Overriding();
	  Overriding ove=new Overriding1();
	 // o.behavior();
	  ov.show();
	  ove.show();
}
}
