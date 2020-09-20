package collection_framework;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(12);
		al.add("rahul");
		al.add("vikash maamu");
		al.add("rajesh");
		al.add(23);
		System.out.println("directly list elements are "+al);//1.fetch list value directly
		Iterator it=al.iterator();    //2.fetch list value by iterator method
		while (it.hasNext()) 
			
			System.out.println("by iterator() print "+it.next());
			//3. fetch list value by for-each loop
			ArrayList<Integer> al1=new ArrayList<Integer>();
	        al1.add(123);
	        al1.add(123);
	        al1.add(13);
	        al1.add(3);
	        
	        for (Integer items : al1) {
				System.out.println("fetch using for-each loop "+items);
			}
	        //4.for loop fetching
	        System.out.println("fetch list by for loop :");
	        for(int i=0;i<al1.size();i++)
	        	System.out.println(al1.get(i));//it can fetch any value from list by index give
	     
	        System.out.println();
	        System.out.println("aur baki ke method lambda expression se juda ha");
	        System.out.println("itna bahut ha mera liya");
			
		}
		}
		

