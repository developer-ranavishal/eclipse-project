package generics$collection;
public class GenericClass <T>
{
	T age;
	T roll_no;
	T weight;
	public GenericClass(T age, T name, T weight) {
		super();
		this.age = age;
		this.roll_no = name;
		this.weight = weight;
	}
	public void show()
	{
		System.out.println("age is "+age);
		System.out.println("rollno is "+roll_no);
		System.out.println("weight is "+weight+" kg");
	}
	public static void main(String[] args) {
		
		GenericClass<Integer> ge=new GenericClass<Integer>(23,34, 45);
		ge.show();
		GenericClass<String> g1=new GenericClass<String> ("21","38", "56.4");
		g1.show();
	}
	
	

}

