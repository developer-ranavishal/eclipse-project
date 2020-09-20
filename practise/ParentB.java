package practise;

 class ParentA1 {
	
	 int i=23;
	 
}
public class ParentB 
{
    ParentA1 A;
	int j=17;
	int k=(A.i);
	int result;
	public void add()
	{
		 result=(k+j);
		System.out.println("result is "+result);
		
	}
	public static void main(String[] args) {
		
		ParentB pb=new ParentB();	
		pb.add();
		
	
	
	}
	
	
}
