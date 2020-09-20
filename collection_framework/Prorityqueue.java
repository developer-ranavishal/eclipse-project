package collection_framework;
import java.util.PriorityQueue;
public class Prorityqueue 
{
	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		/* queue.add(12);
		queue.add(34);
		queue.add(3);
		queue.add(11);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);    */
		PriorityQueue<Data> queue1=new PriorityQueue<Data>();
		queue1.add(new Data("inception", 7.8));
		queue1.add(new Data("Dark web", 5.7));
		queue1.add(new Data("karate king", 9.8));
		for(Data d : queue1)
			System.out.println(d);
	}

}
class Data  implements Comparable<Data>
{
	String movie;
	double rating;
	public Data(String movie, double rating) {
		super();
		this.movie = movie;
		this.rating = rating;
	}
	@Override
	public int compareTo(Data d) {
		return this.movie.compareTo(d.movie);
		
			
		
	}
	@Override
	public String toString() {
		return "Data [movie=" + movie + ", rating=" + rating + "]";
	}
}

	

