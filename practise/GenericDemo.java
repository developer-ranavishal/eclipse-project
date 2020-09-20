package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo 
{
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		List<String> list1=new ArrayList<String>();
		list.add(12);
		list.add(13);
		list.add(1);
		for(Integer item : list)
		{
			System.out.println(item);
			
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		list1.add("vishal");
		list1.add("arun");
		list1.add("raghav");
		for(String item : list1)
		{
			System.out.println(item);
			
		}
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
	    Iterator it=list1.iterator();
	    System.out.println("by iterator");
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	
	}

}
