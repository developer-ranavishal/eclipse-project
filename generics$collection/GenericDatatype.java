package generics$collection;

public class GenericDatatype 
{
	static void print(int age,String name)
	{
		System.out.println(name);
		System.out.println(age);
		
		
	}
	static void print(byte s_no,String city)
	{
		System.out.println(s_no);
		System.out.println(city);
	}
	public static void main(String[] args) {
		 print(23, "vishal rana");
		print(2, "saharanpur");
	}

}
