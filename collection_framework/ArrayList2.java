//passing a class object in list
package collection_framework;
import java.util.*;
public class ArrayList2
{
   public static void main(String[] args) {
	
	  Family f0=new Family("vishal rana", 20, "male", "Student");
	  Family f1=new Family("ashish rana", 34, "male", "Business-Man");
	  Family f2=new Family("amit rana", 25, "male", "job-in-yantra");
	  
	  ArrayList<Family> list=new ArrayList<Family>();
	  list.add(f0);
	  list.add(f1);
	  list.add(f2);
	  System.out.println("show list by for loop");
	  System.out.println();
	 for(Family i : list )
	 {
		 System.out.println("family member : ");
		 System.out.println("name: "+i.name+" age: "+i.age+" gender: "+i.gender+" occupation: "+i.occupation);
	 }
	 Iterator<Family> it=list.iterator();
	 System.out.println();
	 System.out.println("show list by iterator method");
	 while(it.hasNext())
	 {
		 Family f=it.next();
		 System.out.println("family member :");
		 System.out.println("name: "+f.name+" age: "+f.age+" gender: "+f.gender+" occupation: "+f.occupation);
	 }
	 System.out.println();
	 System.out.println("show list by normal for loop :");
	 for(int i=0;i<list.size();i++)
	 {
		 Family f=list.get(i);
		 System.out.println("family member :");
		 System.out.println("name: "+f.name+" age: "+f.age+" gender: "+f.gender+" occupation: "+f.occupation);
	 }
      ArrayList al=new ArrayList(4);
     al.add("hello");
     al.add("bye");
     al.add("next time");
     al.add(12);
     System.out.println(al);
       
     al.set(1, "bye-bye");
     System.out.println(al);
     
     
      
	 
	  
	
	    
	 
	  
}
	
}
class Family
{
	String name;
	int age;
	String gender;
	String occupation;
	public Family(String name, int age, String gender, String occupation) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		
	}
	
	
	
}
