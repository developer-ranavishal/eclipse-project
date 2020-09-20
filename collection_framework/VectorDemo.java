//same as ArrayList but difference is vector is Thread safe class 
package collection_framework;
import java.util.Vector;

public class VectorDemo
{

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(12);
		v.add("rana");
		v.add('e');
		System.out.println(v);
	}
}
