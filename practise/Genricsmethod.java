package practise;

public class Genricsmethod {

	public static <GT> void display(GT array[],GT name)
	{
		System.out.println(name);
		for (GT fetch: array) {
			
			System.out.println(fetch);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array= {12,34,56,67};
		Genricsmethod.display(array,"hello");
		

	}

}
