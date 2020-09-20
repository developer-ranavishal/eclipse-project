package collection_framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
public class CompratorDemo{

	public static void main(String[] args) {
		
	    ArrayList<Product> pq=new ArrayList<Product>();
	    pq.add(new Product("Apple", 60000,1));
	    pq.add(new Product("Samsung", 30000,3));
	    pq.add(new Product("Chinese", 6000,4));
	    pq.add(new Product("Redmi", 20000,2));
	    System.out.println("before sorting");
	    for(Product p : pq)
	    System.out.println(p);
	    System.out.println("after sorting");
	    Collections.sort(pq,new nameProduct());
	    System.out.println("this is sorting with name of product");
	    for(Product p : pq)
	    System.out.println(p);
	    System.out.println("this is sorting with serial no of product");
	    Collections.sort(pq,new SerialProduct());
	    for(Product p : pq)
		    System.out.println(p);
	    System.out.println("this is sorting with cost of product");
	    Collections.sort(pq,new CostProduct());
	    for(Product p : pq)
		    System.out.println(p);
	    
	    
	    

	}

}
