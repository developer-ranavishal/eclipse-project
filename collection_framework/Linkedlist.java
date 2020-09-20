package collection_framework;

import java.util.*;

public class Linkedlist
{
	
   public static void main(String[] args) {
	
	   LinkedList<Integer> list=new LinkedList<Integer>();
	   ArrayList al=new ArrayList();
	   al.add(12);
	   al.add(1);
	   al.add("hover");
	   /* list.add("vishal");
	   list.add("rana");
	   list.addFirst(12);
	   list.add(0, 345);
	   list.addLast(23);
	   System.out.println(list);   */
	   list.add(13);
	   list.add(12);
	   list.add(1, 123);       
	
	    System.out.println(list);
	   System.out.println(al);
	   LinkedList lis=new LinkedList(al);
	   System.out.println("linkedlist element are :"+lis);
	   LinkedList al1=new 	LinkedList(lis);
	   System.out.println("ali elements :"+al1);
	   
	   
	    
	    
	    
	        
}
}

