package practise;

public class Arrayproblem1 
{
	public static void main(String[] args) {
		
		int ar[]= {1,10,2,20,30,40,45,67,89,90};
		
		for(int i=1;i<ar.length;i++)
		{
			if(i%2==0) 
			{
				System.out.print("index-"+i);
				System.out.print(" ");
				System.out.print(ar[i]+" ");
			}
		}
	}

}
