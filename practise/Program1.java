package practise;

public class Program1 implements Cloneable {

	String name;
	int age;
	
	
	public Program1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	public void getData(String address)
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("adress is="+address);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args)throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
	Program1 p=new Program1("vishal rana", 27) ;
	p.getData("kota");
	Program1 o=(Program1)p.clone();
	System.out.println("cloned object");
	o.getData("saharanpur");
	
	

}
}
