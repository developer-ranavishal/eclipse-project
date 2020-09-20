package string_class;

public class String_split 
{
	public static void main(String[] args) 
	{
		String s="vishal,tanvi,rahul,aakash";
		System.out.println(s);
		String s1[]=s.split(",");
		for(String val:s1)
			System.out.println(val);
		System.out.println(s1[2]);
		
	   
	}
	

}
