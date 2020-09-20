package collection_framework;

import java.util.Hashtable;

public class HashTableDemo 
{
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(1,"vishal rana");
		ht.put(3,"arun rana");
		ht.put(2,"himanshu rana");
		ht.put(4,"kuldeep rana");
		ht.put(5,"vishal rana");
		System.out.println(ht);
		System.out.println(ht.hashCode());
		Hashtable<Integer, String> ht1=new Hashtable<Integer, String>();
		ht1=(Hashtable<Integer, String>)ht.clone();
		System.out.println("ht enteries are "+ht);
		System.out.println("ht1 enteries are "+ht1);
		ht.clear();
		System.out.println("ht enteries are "+ht);
		System.out.println("ht1 enteries are "+ht1);
		System.out.println(ht.equals(ht1));
		
	}

}
