package string_class;

public class DemoString1
{
  String s="vishal";
  DemoString1()
  {
	  System.out.println(s);//s=vishal   obj1 of string class
	  String a=s.concat("rana");//a=vishalrana obj2 of string class
	  System.out.println(a);
	  System.out.println(s!=a);
	  System.out.println(s.equals(a));
  }
  
  public static void main(String[] args) 
  {
    DemoString1 d=new DemoString1();
}
	
}
