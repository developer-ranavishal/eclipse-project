package collection_framework;
import java.util.*;
public class SortingDemo
{
public static void main(String[] args) {
	
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(2);
	list.add(12);
	list.add(8);
	list.add(5);
	list.add(19);
	System.out.println(list);
	System.out.println("after sorting the list elements :");
	Collections.sort(list);
	System.out.println(list);
}
}
