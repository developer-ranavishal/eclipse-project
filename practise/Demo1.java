package practise;

import java.util.Scanner;

public class Demo1
{
   int a=12;
    String s="vishal";
    int b;
    String s1;
   void setvalue()
   { 
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   b=sc.nextInt();
	   System.out.print("enter the name");
	   s1=sc.next();
	   
	   }
   public void getvalue()
   {
	 
	   if((a==b) && (s.equals(s1)))
	  System.out.println("data matched");
	   else
		   System.out.println("data does not matched");
   }
   public static void main(String[] args) {
	Demo1 d=new Demo1();
	d.setvalue();
	d.getvalue();
}
}
