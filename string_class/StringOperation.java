package string_class;
public class StringOperation 
{
	String s="vishal rana";
	String s1="rajput";
	StringOperation()
	{
		System.out.println("start of case():");
     String s2= s.toUpperCase();
     System.out.println(s2);
     String s3=s.toLowerCase();
     System.out.println(s);
     System.out.println(s3);
 	System.out.println("end of case():");
	}
	void indexof()
	{ 
		System.out.println("start of index() :");
		//indexof() return integer value so because it give index(integer); 
		String s="vishalrana";
	System.out.println(s.indexOf("h"));
	System.out.println(s.indexOf("h",5));//it give -1 value becse it startsearching from 5
	System.out.println(s.indexOf("is"));
	System.out.println(s.indexOf("al",4));
	System.out.println(s.indexOf("al",7));
	System.out.println("end of indexof() :");
	}
	void lastindexof()
	{
		System.out.println("start of lastindexof():");
		String s="vishalrana";
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.lastIndexOf("l",4));
		System.out.println(s.lastIndexOf("l",7));
		System.out.println(s.lastIndexOf("ha"));
		System.out.println(s.lastIndexOf("ha",6));
		System.out.println(s.lastIndexOf(7));
		System.out.println("end of lastindexof():");
		
	}
	void comparing()
	{
		String s="tanvirana";
		String s1="Tanvirana";
		System.out.println("start of comparingstring():");
		System.out.println("equals():"+s.equals(s1));
		System.out.println("equalsIgnoreCase():"+s.equalsIgnoreCase(s1));
		int i=s.compareTo(s1);
		if(i>0)
			System.out.println("ignore dictionary order");
		else if(i==0)
			System.out.println("no change in order of string");
		else
			System.out.println("follow dictionary order");
		System.out.println("end of comparing():");
	}
	void substring()
	{
		System.out.println("substring() start:");
	   String s="vishalrana";
	   System.out.println("substring(int beg):"+s.substring(2));
	   System.out.println("substring(int beg,int end):"+s.substring(2,6));
	}
	void remaining()
	{
		System.out.println("all remaining() of string:");
		 String s="vishalrana";
		  String s1=s.intern();
		  System.out.println("intern():"+s1);
		  System.out.println("isEmpty():"+s.isEmpty());
		  System.out.println("string join() with delimiter:"+String.join("-", "vishal" ,"rana"));
		System.out.println("date:"+String.join("/", "01" ,"april","2020"));
		System.out.println("length:"+s.length());
		System.out.println("string endWith():"+s.endsWith("ana"));
		System.out.println("string startWith():"+s.startsWith("vi"));
		System.out.println("string replace():"+s.replace("rana", " thakur"));
		System.out.println("string charat():"+s.charAt(8));
	}  
	public static void main(String[] args) 
	{
		StringOperation st=new StringOperation();
		st.indexof();
		st.lastindexof();
		st.comparing();
        st.substring();
        st.remaining();
	} 
			

}
