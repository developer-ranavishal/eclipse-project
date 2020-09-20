package practise;

public class Class_Object {

	public static void main(String[] args) {
	
		Car car1=new Car("AUDI",2022);
		Car car2=new Car("BMW",2025);
		Car car3=new Car("SAFARI",2030);
		
		System.out.println(car1.toString());
		

	}

}
class Car
{
	String name="";
	String color="blue";
	int launch_year=2022;
	String feature="self driving " +color+ " car ";
	public Car(String name, int launch_year) {
		super();
		this.name = name;
		this.launch_year = launch_year;
	}
		public String Audi() {
			
			return "this car have priority no 2 in india"+"name is "+name;
			
		}
       public String Bmw() {
			
			return "this car have priority no 1 in india"+"name is "+name;
			
		}
        public String Safari() {
	
	      return "this car have priority no 3 in india"+"name is "+name;
	
}
		@Override
		public String toString() {
			return "Car [name=" + name + ", color=" + color + ", launch_year=" + launch_year + ", feature=" + feature
					+ "]";
		}
		
	
	
	
	
}
