package practise;
public class InheitanceDemo1
{

	public static void main(String[] args) {
		
		Use1 u=new Use1(4, "saharanpur", "love books");
		
		

	}
}
class Essential
{
   String name;
   int age;
public Essential(String name, int age) {
	this.name = name;
	this.age = age;
}
}
class Use extends Essential
{
	int id;
	Use(int id)
	{
	super("vishal rana",24);
	this.id=id;
	System.out.println(name);
	System.out.println(age);
	System.out.println(id);
	 
	
}
}
class Use1 extends Use
{
	String city;
	String hobby;
	public Use1(int id, String city, String hobby) {
		super(id);
		this.city = city;
		this.hobby = hobby;
		System.out.println(city);
		System.out.println(hobby);
	}
	
	
}
   
   