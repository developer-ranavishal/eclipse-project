package enumrated_datatype;

public class EnumDemo2 
{
	enum Skill
	{
		C,JAVA,PYTHON
	}
	public static void main(String[] args) {
		
	 for (Skill constant : Skill.values()) //values() return the array of Enum type
		 System.out.println(constant);	
	 System.out.println("the named constant value of : "+Skill.valueOf("JAVA"));
	//valueOf(String s) simple return a string which pass as a argument
	 System.out.print("the named constant value of : "+Skill.valueOf("JAVA").ordinal());
	 
	 /* 
	  *  ordinal is a inner method of valueOf() simply return the named constant value 
	  * */
	 
	}
	//enum ended

}
