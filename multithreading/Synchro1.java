package multithreading;
public class Synchro1 {

	public static void main(String[] args) {
		Table table=new Table();
		Two tw=new Two(table);
		Two tw1=new Two(table);
		Three th=new Three(table);
		tw.start();
		th.start();
		
		
	}
}
class Table
{
	public synchronized void print(int n)
	{
	for(int i=1;i<=5;i++)
	{
		
		System.out.println(n+"*"+i+"="+(n*i));
		try
		{
		Thread.sleep(1000);
		}catch( InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	}
}
class Two extends Thread
{
	Table table; 
	int n=2;
	public Two(Table table) {

		this.table = table;
	}
	
	public void run()  {
		table.print(n);
		
	}
}
class Three extends Thread
{
	Table table; 
	int n=3;
	public Three(Table table) {

		this.table = table;
	}
	
	public void run()  {
		table.print(n);
		
	}
}
