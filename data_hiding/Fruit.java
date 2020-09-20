package data_hiding;

public interface Fruit
{
	 int a=12;//public+static+final
	public abstract  void taste();//public+abstract


}
interface Marker
{
	
}
 interface Sweet
 {
	 void quantity();
	
 }
 class Mango implements Fruit,Sweet,Marker
 {
	 public void taste()
	 {
		 System.out.println("mango taste is sweet");
	 }
	 public void quantity() 
	 {
		 System.out.println("mango have 90% sweet quantity");
	 }
 }
