package collection_framework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.add(12);
		s.add(1);
		s.push(1323);
		s.push("item");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	}
	

}
