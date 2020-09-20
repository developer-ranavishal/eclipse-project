package practise;

public class GenricsDemo <GT> 
{
	GT i;
	public GenricsDemo(GT i) {
		this.i=i;
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		
		Integer i=12;   String s="hello";
		GenricsDemo<String> gd=new GenricsDemo<>(s);
		GenricsDemo<Integer> gd1=new GenricsDemo<>(i);
		
	}
}
