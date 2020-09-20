package important;

public class Objectclonning1 implements Cloneable
{

	int i,j;

	public Objectclonning1(int i, int j) 
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	 
	@Override
	public String toString() {
		return "Objectclonning1 [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Objectclonning1 obj1=new Objectclonning1(12, 4);
		Objectclonning1 obj2=(Objectclonning1)obj1.clone();
		obj2.i=1;
		System.out.println(obj1);
		System.out.println(obj2);
		
	   
	}
	 

}
