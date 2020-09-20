package enumrated_datatype;

public class EnumDemo 
{
	enum Day
	{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		
	}
	public static void main(String[] args)
	{
		
       Day s=Day.SUNDAY;
       System.out.println(s);
       System.out.println(Day.MONDAY);
       System.out.println(Day.TUESDAY);
       System.out.println(Day.WEDNESDAY);
       System.out.println(Day.THURSDAY);
       
	}
  
}

