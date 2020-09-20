package string_class;

public class DemoString 
{
   String s="vishal rana";//object creation by string literal
   String a=new String("hello world");//object creation by new keyword
   String b=new String("hello world");
   DemoString()
   {
	   System.out.println("name is "+s);
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(a==b);
	   System.out.println(a.equals(b));//equals is a method of object class 
	   
   }
   void compare()
   {
	   String s1="vishal rana";
	   String s2="vishal rana";
	   String s3="vishal";
	   String s4=s3+" rana";
	   
	   System.out.println(s1==s2);
	   System.out.println(s1==s3);
	   System.out.println(s1.equals(s4));
   }
    public static void main(String[] args) 
    {
    	DemoString d=new DemoString();
    	d.compare();
		
	}
}
