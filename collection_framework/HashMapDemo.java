package collection_framework;

import java.util.HashMap;

public class HashMapDemo 
{
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "age 15");
		map.put(2, "age 21");
		map.put(3, "age 44");
		map.put(null, "null");
		System.out.println(map);
		System.out.println(map.entrySet());
	
		System.out.println(map.values());
		System.out.println(map.putIfAbsent(4, "vijay raj"));
	}

}
