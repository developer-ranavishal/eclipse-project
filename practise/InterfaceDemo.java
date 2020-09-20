package practise;

interface InterfaceDemo {

	int a=12;
 static void m()
 {
	 System.out.println("hello world");
	
 }
 default void  m1()
 {
	 System.out.println("hello india");
	 
 }
 
 
public static void main(String[] args) {
	m();
	
	

}
}
class B implements InterfaceDemo
{
	void m2()
	{
		
		m1();
		
	}
	
	public static void main(String[] args) {
		
		B b=new B();
		b.m2();
	}
	
}
