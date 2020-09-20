package collection_framework;

import java.util.*;

public class SetClasses 
{
    public static void main(String[] args) {
		
    	
    	HashSet set=new HashSet();
    	// HashSet set1=new HashSet(new ArrayList());
    	set.add(12);
    	set.add(23.5);
    	set.add("vishal rana");
    	set.add(12);
    	set.add("vishal rana");
    	System.out.println("simply set printed ::"+set);
    	Iterator it=set.iterator();
    	System.out.println("by iterator interface ::");
    	while(it.hasNext())
    	{
    		System.out.println(it.next());
    	}
    	System.out.println("LinkedHashset class ::");
    	LinkedHashSet lset=new LinkedHashSet();
    	lset.add(123);
    	lset.add("hello");
    	lset.add('a');
    	lset.add('a');
    	System.out.println(lset);
		
    	
    	
    	
           
    	
    	
    	
	}
}
