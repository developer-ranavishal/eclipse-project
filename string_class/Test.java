package string_class;

public class Test 
{
	public static void main(String[] args) 
	{
	   To_string t=new To_string("vishal rana",43,"kota");
	   To_string t1=new To_string("himanshu rana",12,"sidki");
	   System.out.println(t);//internally call t.toString() from object class
	   System.out.println(t1);
		
	}

}
class To_string
{
	String name;
	int rollno;
	String village;
	public To_string(String name, int rollno, String village) 
	{
		this.name = name;
		this.rollno = rollno;
		this.village = village;
	}
	@Override
	public String toString() {
		return "To_string [name=" + name + ", rollno=" + rollno + ", village=" + village + "]";
	}
	
	
	
	

	
}
