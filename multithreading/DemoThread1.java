//implementation of thread by extend thread class
package multithreading;
class X extends Thread
{
  int i=0;
  public void run()
  {
	  do
	  {
		  System.out.println("when i="+i+" Thread 1");
		  i++;
	  }while(i<=5);
	  
  }
  
}
class Y extends Thread
{
  int i=0;
  public void run()
  {
	  do
	  {
		  System.out.println("when i="+i+" Thread 2");
		  i++;
	  }while(i<=5);
	  
  }
}
public class DemoThread1 
{
	public static void main(String[] args) {
		
	   X t1=new X();
	   Y t2=new Y();
	   t1.start();
	   t2.start();
	}
}


