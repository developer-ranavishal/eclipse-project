package practise;

public class MethodOverloading 
{
   public static void main(String[] args) {
	/* Journey j=new Journey();
	j.display("bus");
	j.display("car", 23); */
	   Test t=new Test();
	   t.display("rana");
}
}
class Journey
{
     void display(String travel,int age)
     {
    	 System.out.println("ok travel by "+travel+" age is "+age);
     }
      void display(String travel) 
      {
    	  System.out.println("ok travel by "+travel);
    	  
      }
    
}
class Test extends Journey
{
	void display(String name)
	{
		super.display("by bus",12);
	}
}
