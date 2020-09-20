package practise;

public class Wrapperpractise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		Integer i=new Integer(a);//autoboxing
		int r=i;//unboxing
		System.out.println(i);
		String s="1234";
		 int f=(int)(Float.parseFloat(s));
		 System.out.println(f);
		 char c='e';
		 int c1=c;
		 System.out.println(c1);
		 int w=89;
		 char w1=(char)w;
		 System.out.println(w1);

	}

}
