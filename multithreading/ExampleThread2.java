package multithreading;

public class ExampleThread2  
{   
	public static void main(String[] args) 
{
	Test te=new Test();
	Test t1=new Test();
	Test t2=new Test();
	te.start();
	try
	{
	te.join();
	}
	catch( InterruptedException e)
	{
		System.out.println("exception is "+e.getMessage());
	}
	t1.start();
	t2.start();
}
}
	class Test extends Thread
	{
    public void run() {
    	
    	for(int i=0;i<=4;i++)
    	{
    		System.out.println("running thread is "+Test.currentThread().getName());
    		System.out.println("i="+i);
    	}
    }
}


