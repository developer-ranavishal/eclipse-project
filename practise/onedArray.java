package practise;

public class onedArray 
{

	public static void main(String[] args) {
		
		int ar[]=new int[]{1,3,4,5};
		int ar1[]= {1,3,4};
		int ar2[];
		ar2=new int[3];
		ar2[0]=1;
		ar2[1]=4;
		ar2[2]=34;
		int a[];
		try
		{
		 a=null;
		}
		catch(NullPointerException exc)
		{
			System.out.println("hey this is null exception "+exc.toString());
		}
		
	}
}
