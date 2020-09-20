package practise;

public class Program2 extends DemoProgram

{
	int i=99;
	
@Override
	protected void increment() {
		// TODO Auto-generated method stub
		System.out.println(++i);
	}

public static void main(String[] args) {
		
		Program2 p=new Program2();
		p.increment();
		
	}
}

class DemoProgram
{
	int i=5;
	protected void increment()
	{
		System.out.println("i="+"hello");
	}
	
	
	

}
