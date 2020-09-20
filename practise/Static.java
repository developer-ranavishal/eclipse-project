package practise;

public class Static
{
    static int experience=4;
    static String city="SAHARANPUR";
    String name;
    int age;
    public Static(String name,int age) 
    {
    	
	   this.age=age;
	   this.name=name;   
    	
	}
    void print()
    {
    	System.out.println("details of "+name+" are");
    	System.out.println(" name is "+name+" : age is "+age+": experience of "+experience+" years: city is "+city);
    }
   public static void main(String[] args) {
	Static c=new Static("vishal rana",20);
	Static c1=new Static("sarang mehta",25);
	c.print();
	c1.print();
	
}
}
