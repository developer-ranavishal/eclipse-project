package collection_framework;

import java.util.*;
import java.lang.*;

public class TreeSetDemo 
{

	public static void main(String[] args) {
	
      //ArrayList<Empolyeeinfo> set=new ArrayList<Empolyeeinfo>();
		TreeSet<Empolyeeinfo> set=new TreeSet<Empolyeeinfo>();
      set.add(new Empolyeeinfo("vishal", 12,2));
      set.add(new Empolyeeinfo("arun",18,4));
      set.add(new Empolyeeinfo("rinku", 22,1));
      for(Empolyeeinfo obj : set)
      {
    	  System.out.println(obj);
      }
      
		
	
	    
	}
}
class Empolyeeinfo implements Comparable<Empolyeeinfo>
{
	
	String name;
	int age;
	int rank;
	public Empolyeeinfo(String name, int age,int rank) {
		super();
		this.name = name;
		this.age = age;
		this.rank=rank;
	}
	
	
	@Override
	public int compareTo(Empolyeeinfo e) 
	{
		System.out.println("rank ="+rank);
		System.out.println("e.rank"+e.rank);
		if(rank>e.rank)
		{
			
		return 1;
		}
		else if(rank<e.rank)
		{
			
		return -1;
		}
		else
			return 0;
	}
	@Override
	public String toString() {
		return "Empolyeeinfo [name=" + name + ", age=" + age + ", rank=" + rank + "]";
	}
	
	
	
	
	
} 
