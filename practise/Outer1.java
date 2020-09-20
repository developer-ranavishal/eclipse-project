package practise;
//outer class
public class Outer1 {

	int a=12,b=34,c;
	public Outer1() {
		System.out.println("original value of a="+a+" b="+b);
	}
	void outer()
	{
		System.out.println("hello outer");
		Inner1 i=new Inner1();//2nd way to create inner class object
		System.out.println("printing in outer class instace method");
		i.inner();
		
			
	}
	   // inner class 
	      class Inner1
	    {
	    	
		    int d;//valid
         // static int s;invalid can't declare static member in normal inner class but access d
		     void inner()
		    {
			System.out.println("hello inner");
			
			System.out.println("after swapping");
			c=a;//c=12
			a=b;//a=34
			b=c;//b=12	
			  System.out.println("a= "+a);
			  System.out.println("b= "+b);
		     }
		    
		     class Inner2
		     {
		    	 void inner2()
		    	 {
		    		 System.out.println("hello i am inner2 class inside the Inner1 class");
		    	 }
		     }
		   
	    }   
	      //end of inner class
	      
	      
	 public static void main(String[] args) {
		Outer1 o=new Outer1();
		o.outer();
		Outer1.Inner1 in=o.new Inner1();     // first way to create the object
		  in.inner();                      //  // inner class object
		  Inner1.Inner2 in2=in.new Inner2();
		  in2.inner2();
		                         
		}
	
	
}
