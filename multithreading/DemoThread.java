//implementation of thread by implement the Runnable interface
package multithreading;
public class DemoThread
{
	public static void main(String[] args) {
		DemoThread d=new DemoThread();
	Thread t1=new Thread(d.new A());
	Thread t2=new Thread(d.new B());
	t1.start();
	t2.start();
	}
	class A implements Runnable
	{
		public void run()
		{
			int i=1;
			while(i<=7)
			{
				System.out.println("Thread 1");
			i++;
		}
			System.out.println("hello vishal");
			
		}
		
	}
	class B implements Runnable
	{
		public void run()
		{
			int i=1;
			while(i<=7)
			{
				System.out.println("Thread 2");
			i++;
		}
		}
		
	}
	
}
