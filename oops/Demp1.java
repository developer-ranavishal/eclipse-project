package oops;

public class Demp1 
{
	void han()
	{
		System.out.println("kya haal ha");
	}
}
class Demo11 extends Demp1
{
	void han()
	{
		System.out.println("thik ha bhai");
		
	}
}
class A
{
	 public static void main(String[] args) 
	 {
		Demo11 de=new Demo11();
		System.out.println(de instanceof Demo11);
	 }
}