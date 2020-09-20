package generics$collection;

public class Genericclassmethod <T>  //generic class
{
	
		T age;
		T roll_no;
		T weight;
	
		public Genericclassmethod(T age, T roll_no, T weight) {
			super();
			this.age = age;
			this.roll_no = roll_no;
			this.weight = weight;
		}
		public <e> void show(e[] a,e[] b)   //.generic method
		{
			System.out.println("age is "+age);
			System.out.println("rollno is "+roll_no);
			System.out.println("weight is "+weight+" kg");
			for(e fetch : a)
				System.out.println("the integer array element is "+fetch);
			for(e fetch : b)
				System.out.println("the String array element is "+fetch);
			
		}
		public void display(Employee a, Employee1 b)
		{
			a.Employeedata();
			b.Employeedata();
		}		
		public static void main(String[] args) {
			
			Integer[] a=new Integer[] {12,34,56};
			String[] s=new String[] {"vishal","tanvi","ravish"};
			Character[] c= {'a','b','c'};
			Genericclassmethod<Integer> ge=new Genericclassmethod<Integer>(23,34, 45);
			ge.show(s,c);
			Genericclassmethod<String> g1=new Genericclassmethod <String> ("21","38", "56.4");
			g1.show(a,c);
			Employee e=new Employee();
			Employee1 e1=new Employee1();
			
			g1.display(e,e1);
		
		}
		
		

}
class Employee
{
	String[] name= { "vishal","abhishek","sumit","ajay"};
	Integer age[]= {21,25,34,34};
	public void Employeedata() {
		System.out.println("this is employees data");
		for(String fetch : name)
			System.out.println("name is "+fetch);
		for(int fetch : age)
			System.out.println("age is "+fetch);
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
	}
}
class Employee1
{
	String[] name= { "sehwag","dhoni","raina","kohli"};
	Integer age[]= {41,35,30,24};
	public void Employeedata() {
		System.out.println("this is employees 1 data");
		for(String fetch : name)
			System.out.println("name is "+fetch);
		for(int fetch : age)
			System.out.println("age is "+fetch);
	}
	public static void main(String[] args) {
		
		Employee1 e=new Employee1();
		
	}
}

