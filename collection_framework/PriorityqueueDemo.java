package collection_framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityqueueDemo 
{
	public static void main(String[] args) {
	
		/* PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("hello");
		queue.add("yelo");
		queue.add("pelo");
		queue.add("khalo");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.element());
		System.out.println(queue.offer("ji"));
		System.out.println(queue);                  */
		
		PriorityQueue<Percentage> queue=new PriorityQueue<Percentage>();
		queue.offer(new Percentage("vishal rana", 550, 444));
		queue.offer(new Percentage("arun rana", 550, 450));
		queue.offer(new Percentage("tarun rana", 550, 350));
		queue.offer(new Percentage("bunty rana", 550, 490));
		for (Percentage percentage : queue) {
			System.out.println(percentage);
		}
		
		System.out.println("now delete elements one by one :");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}	

}
class Percentage implements Comparable<Percentage>
{
	String name;
	int total_marks;
	int marks_obtained;
	public Percentage(String name, int total_marks, int marks_obtained) {
		super();
		this.name = name;
		this.total_marks = total_marks;
		this.marks_obtained = marks_obtained;
	}
	@Override
	public int compareTo(Percentage o) {
		
	   return this.name.compareToIgnoreCase(o.name);
	}
	@Override
	public String toString() {
		return "Percentage [name=" + name + ", total_marks=" + total_marks + ", marks_obtained=" + marks_obtained + "]";
	}
	
	
	
}
