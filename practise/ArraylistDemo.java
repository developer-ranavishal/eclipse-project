package practise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		Integer[] ar= {12,34,56,78};
		for (int i = 0; i < ar.length; i++) {	
		list.add(ar[i]);
		}
		list.add("hello");
		list.add(12);
		list.add(34.6);
		list.add('a');
		System.out.println(list);
		System.out.println(list.contains(1));
		System.out.println(list.indexOf(12));
		System.out.println(list.isEmpty());
		System.out.println(list.subList(1, 4));
		Iterator it=list.iterator();
		while (it.hasNext()) {
			Integer object = (Integer) it.next();
			System.out.println(object);
			
		}
	
		
		

	}

}
