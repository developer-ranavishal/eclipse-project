package collection_framework;

import java.util.Arrays;

public class ArraysClass 
{
	public static void main(String[] args) {
		
		int ar[]= {125,34,60,5};
		for(int item : ar)
		{
			System.out.println(item+" ");
		}
		Arrays.sort(ar);//sorting the arrray
		System.out.println("after sorting");
		for(int item : ar)
		{
			System.out.println(item+" ");
		}
		System.out.println("binary search of elements in a array");
		System.out.println(Arrays.binarySearch(ar, 125));
		Arrays.fill(ar, 1, 3, 45);
		for(int item : ar)
		{
			System.out.println(item+" ");
		}
		
	}
	

}
