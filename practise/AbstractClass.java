package practise;

public class AbstractClass extends Person1
{
	void definePerson()
	{
		System.out.println("this is student");
		
	}
	void showage()
	{
		System.out.println("age is 16");
	}
	
	public static void main(String[] args) {
		
		AbstractClass ac=new AbstractClass();
		ac.definePerson();
		ac.setavalue(12, 13);
		System.out.println(ac.getavalueb());
		System.out.println(ac.getavaluea());
		ac.show();
	
	}

}
abstract class Person
{
	 private int a,b;
	void show()
	{
		System.out.println("hello world");
	}
	void setavalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int getavaluea()
	{
		return a;
	}
	int getavalueb()
	{
		return b;
	}
	abstract void definePerson();
}
abstract class Person1 extends Person
{
	abstract void definePerson();
	abstract void showage();
}
