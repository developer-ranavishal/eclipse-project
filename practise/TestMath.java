package practise;

public class TestMath 
{
	private int i,j,k,l;
	float f,f1;
	double d,d1;
	public TestMath(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	void evaluate()
	{
		f=12.456f;
		d=3.0;
		System.out.println("sum is "+Math.addExact(i, j));
		System.out.println(Math.abs(f));
		System.out.println(Math.abs(d));
	   System.out.println("max blw two int : "+Math.max(i, j));
	   System.out.println("minimum between two number : "+Math.min(i, j));
	   System.out.println(Math.pow(12,7));
	   System.out.println(Math.round(d));
	   System.out.println(Math.exp(d));
	   System.out.println();
	   
	}

	public static void main(String[] args) {
		
		TestMath te=new TestMath(12, 4);
		te.evaluate();
		
		
	}
}
