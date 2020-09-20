package collection_framework;

import java.util.*;

public class SortedsetInterfce 
{

	public static void main(String[] args) {
		
	   NavigableSet s=new TreeSet();
		s.add(12);
		s.add(1);
		s.add(23);
		s.add(4);    //Sortedset and Navigableset is interface and Treeset is a class
		s.add(2);     //sorted order is preserved not insertion order
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.subSet(1, 12));
		System.out.println(s.headSet(3));
		System.out.println(s.tailSet(12));
		System.out.println(s.ceiling(11));
		System.out.println(s.floor(3));
		
	}
}
