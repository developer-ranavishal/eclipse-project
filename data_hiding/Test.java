package data_hiding;

public class Test 
{
  public static void main(String[] args) {
	Mango m=new Mango();
	m.taste();
	m.quantity();
	System.out.println(m instanceof Marker);
}
}
