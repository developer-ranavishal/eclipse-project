package practise;
public class Demo3 
{
	public Demo3(int ... args) 
	{
		System.out.println(args.length);
		for (int i : args)
		{
			System.out.print(i+ " ");		
		}
		
	}
   public static void main(String[] args) 
   {
	   Demo3 de=new Demo3(23,34,5);
	   int ar[][];
	 ar=new int[][] {{12,23},{2,45,34}};
	 System.out.println();
	 for (int i = 0; i < 2; i++)
	 {
		 for (int j = 0; j < ar[i].length; j++) 
		 {
			System.out.print("ar["+i+"]["+j+"]= "+ar[i][j]);
			System.out.print(" ");
		 }
		     System.out.println();
			 System.out.println();
	}
   }
   }

