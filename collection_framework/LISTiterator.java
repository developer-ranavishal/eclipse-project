package collection_framework;
import java.util.*;
public class LISTiterator
{
	public static void main(String[] args) {
		
     ArrayList<Float> al=new ArrayList<Float>();
     al.add(1.3f);
     al.add(1.312f);
     al.add(12.3f);
     al.add(11.3f);
       Iterator i=al.iterator();
       while(i.hasNext())
       {
    	  System.out.println(i.next());
       }
       System.out.println("above iterator work :");
       ListIterator li=al.listIterator();
       System.out.println("list iterator work :");
       while(li.hasNext())
       {
    	   System.out.println(li.next());
       }
       System.out.println("traverse in backward ");
       while(li.hasPrevious())
       {
    	   System.out.println(li.previous());
       }
	}
	//list iterator can traverse in forward as well as backward direction

}
