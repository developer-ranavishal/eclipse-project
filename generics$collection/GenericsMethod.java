package generics$collection;
//here we see the generics method by practical
public class GenericsMethod {

	public <E> void printarray(E s[])   //generic method
	 {
		 for(E e: s)
		
			 System.out.println(e);
		 
	 }
	 
	 
	 
	public static void main(String[] args) {
		
		GenericsMethod ge=new GenericsMethod();
		String s[]= {"vishal","tanvi","vijay","abhishek" };
		Integer i[]= {12,34,6,76};
		
		ge.printarray(s);
		ge.printarray(i);

	}

}
class Customer extends GenericsMethod
{
	
	 public <w> Customer(w []f) {        //  generic constructor
		for(w p : f)
			System.out.println(p);
	}

	public static void main(String[] args) {
		Customer c=new Customer(new Float[] {12.3f,12.4f,1.3f});
		Customer c1=new Customer(new String[] {"vishal","tanvi"});
		
		Integer age[]= {22,23,45,34};
		c.printarray(age);
	}
}
