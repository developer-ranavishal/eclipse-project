package collection_framework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsClass 
{
   public static void main(String[] args) {
	
	  List<String> list=new LinkedList<String>();
	  List<Integer> list1=new LinkedList<Integer>();
	  list.add("vishal");
	  list.add("arun");
	  list.add("ramesh");
	  list.add("suresh");
	//  System.out.println(list);
	  list1.add(12);
	  list1.add(2);
	  list1.add(8);
	  list1.add(6);
	Collections.sort(list1);
	System.out.println(list1);
	Collections.sort(list1,Collections.reverseOrder());
	System.out.println(list1);
	 
	Collections.reverse(list1);
	System.out.println(list1);
	System.out.println(Collections.min(list1));
	System.out.println(Collections.max(list1));
	Collections.swap(list1, 1, 3);
	System.out.println(list1);
	
	 // System.out.println(Collections.binarySearch(list, "suresh"));
	//  System.out.println(list);
	
}
}
