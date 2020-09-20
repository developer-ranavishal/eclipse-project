package collection_framework;
import java.util.Comparator;
public class Product 
{
  String name;
  int cost;
   int s_no;
public Product(String name, int cost, int s_no) {
	super();
	this.name = name;
	this.cost = cost;
	this.s_no = s_no;
}
@Override
public String toString() {
	return "Product [name=" + name + ", cost=" + cost + ", s_no=" + s_no + "]";
}


  
}
class nameProduct implements  Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.name.compareToIgnoreCase(o2.name);
		
	}
	
}
class SerialProduct implements  Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.s_no>o2.s_no)
		return 1;
		else
			return -1;
		
		
	}
	
}
class CostProduct implements  Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.cost>o2.cost)
		return 1;
		else
			return -1;
		
		
	}
	
}