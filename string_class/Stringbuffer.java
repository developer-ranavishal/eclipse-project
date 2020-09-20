package string_class;

public class Stringbuffer 
{
	public static void main(String[] args) {
		
   StringBuffer s=new StringBuffer("hello");
   StringBuffer s1=s.append("vishal");
   String f="hello";
   String f1=f.concat("rana");
   if(s1==s)
	   System.out.println("s1 and s are same:");
   else
	   System.out.println("not same");
   if(f==f1)
	   System.out.println("f1 and f are same:");
   else
	   System.out.println("f1 and f are not same");
   StringBuffer sb=new StringBuffer("vishal");
    StringBuffer w=sb.insert(0, "rana ");
      System.out.println( w.reverse());
    System.out.println("w is "+w);
   
	}
}
