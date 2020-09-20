package collection_framework;

import java.util.*;

public class ComprableSorting {

  public static void main(String[] args) {
	
	  List<Family1> list=new ArrayList<Family1>();
	  list.add(new Family1("Pitamber rana", 70, "old but for me always gold"));
	  list.add(new Family1("Vishal rana", 20, "youngster"));
	  list.add(new Family1("Arun rana ", 21, "Youngster"));
	  Collections.sort(list);
	 for(Family1 item : list)
	 {
	       Family1 val=(Family1)item;
	       System.out.println(val);
     }
}
}
class Family1 implements Comparable
{
	
	String name;
	int age;
	String status;
	public Family1(String name, int age, String status) {
		super();
		this.name = name;
		this.age = age;
		this.status = status;
	}
	@Override
	public int compareTo(Object obj1) {
		Family1 obj=(Family1)obj1;
		return this.name.compareTo(obj.name);
		
	}
	@Override
	public String toString() {
		return "Family1 [name=" + name + ", age=" + age + ", status=" + status + "]";
	}
	
}

	
	

