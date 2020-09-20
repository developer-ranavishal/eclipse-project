package practise;

import java.util.Scanner;

class EmployeeData
{
  String name;
  int age;
  String position;
  int salary;
  void show()
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("please enter the name :");
	 this.name=sc.nextLine();
	 System.out.println("name :" +name);
	 System.out.println("please enter the age:");
	 age=sc.nextInt();
	 System.out.println("age : "+age);
	 System.out.println("please enter the position:");
	 this.position=sc.next();
	 System.out.println("position :" +position);
	 System.out.println("please enter the salary:");
	 this.salary=sc.nextInt();
	 System.out.println("salary :" +salary);
	  
  }
@Override
public String toString() {
	return "EmployeeData [name=" + name + ", age=" + age + ", position=" + position + ", salary=" + salary + "]";
}
  
 
	
}
class Emp extends EmployeeData

	
	String tenthper;
	String twelthper;
	String work;
	
	void getall(EmployeeData e)
	{
		e.show();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("please enter the 10th cgpa:");
		this.tenthper=sc.nextLine();
		System.out.println("10th cgpa : "+tenthper);
		 System.out.println("please enter the 12th cgpa:");
		this.twelthper=sc.nextLine();
		System.out.println("12th cgpa : "+twelthper);
		 System.out.println("please enter the work way:");
		this.work=sc.nextLine();
		System.out.println("work way : "+work);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		
		EmployeeData e1=new EmployeeData();
		Employee e=new Employee();
		e.getall(e1);
		
		
	}

}

