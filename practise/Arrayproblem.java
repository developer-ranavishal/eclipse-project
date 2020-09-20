package practise;

public class Arrayproblem 
{
	public static void main(String[] args) {
		
		int ar[]= {1,10,2,20,30,40};
		System.out.println(ar[0]);
		for(int i=1;i<ar.length;i++)
		{
			if(i%2==0)
				System.out.print(ar[i]+" ");
		}
	}

}
