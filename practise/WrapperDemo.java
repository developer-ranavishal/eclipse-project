package practise;

public class WrapperDemo 
{
	public static void main(String[] args) {
		
		int i=23;
		int j=13;
	  Integer I=i;//autoboxing done by compiler but how?
	  Integer J=Integer.valueOf(j); // same as   Integer J=j;
	  Integer h=new Integer(12);
      System.out.println(h.hashCode());
	  System.out.println(h);
	  Integer t=1;
	  Integer r=13;
	  int t1=t;//unboxing done by compiler but how?
	  int r1=r.intValue();// same as int r1=r;
	  String s="1245";
	int s1=Integer.parseInt(s);//String to int conversion
	  System.out.println("string into int value is "+s1);
	   
	  /*    range of values stored in  wrapper class
	   * Byte--(-128 to 127)
	   * 
	   * Short--(-128 to 127)
	   * 
	   * Integer--(-128 to 127)
	   * 
	   * Long--(-128 to 127)
	   * 
	   * Character--(0 to 127)
	   * 
	   * Boolean--(True or False)
	   * 
	   * Float--(no any range/infinite floating value range)
	   * 
	   * Double--(no any range/infinite floating value range)
	   * 
	   * 
	   * 
	   * 
	   * 
	   * 
	   * */
	  
	  
	  
	  
	  
		
	}

}
