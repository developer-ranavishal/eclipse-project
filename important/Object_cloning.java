package important;

public class Object_cloning
{
	int i,j;
	public static void main(String[] args) 
	{
		Object_cloning obj=new Object_cloning();
	    obj.i=12;
	    obj.j=23;
	    Object_cloning obj1=obj;//shallow copy
	    obj.j=6;
	    System.out.println(obj1);//i=12,j=6; expecting
	    System.out.println(obj);//12,23  expecting  
	    System.out.println("shallow copy ended");
	    Object_cloning obj2=new Object_cloning();
	    obj2.i=obj1.i;
	    obj2.j=obj.j;
	    System.out.println(obj2);
	    

	}
	@Override
	public String toString() {
		return "Object_cloning [i=" + i + ", j=" + j + "]";
	}
	
	

	
}
