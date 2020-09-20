package practise;
import java.util.*;

public class ListTest
{
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("hello");
		list.add(12);
		list.add(12.45);
		list.add(13);
		System.out.println(list);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
		   System.out.println(it.next());
	    }

}
}
