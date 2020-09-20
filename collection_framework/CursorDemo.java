package collection_framework;
import java.util.*;
import practise.*;
public class CursorDemo extends Demo1  {

	public static void main(String[] args) {
		Integer i=new Integer(9);
		Vector<Float> f=new Vector<Float>();
		f.add(12.3f);
		f.add(2.4f);
		f.add(3.4f);
		System.out.println("float :"+f);
		Vector v=new Vector();
		Vector v1=new Vector();
		v.add("vishal");
		v.add(12);
		v.add("hello");
		v.add(i);
		v1.add(f);
		System.out.println(v);
	    Enumeration e=v1.elements(); 
	    while(e.hasMoreElements())
	    {
	    	Float f1=(float)e.nextElement();
	    	System.out.println(f1);
	    	  
	    }
	    
	  
	   
	    
	}

}
