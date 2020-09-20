package oops;

abstract public class Person1 
{
  String name;
  int age;
  String gender;
  abstract void name();
  abstract void age();
  abstract void gender();
}
abstract class Ramesh extends Person1
{	
	abstract void age();
	abstract void gender();
	
}
  class Suresh extends Ramesh
{
	  void name()
	  {
	  		System.out.println("name is vishal rana");
	  	
	  }
	 void gender()
	{
		System.out.println("male");
	}
	 void age()
	 {
		 System.out.println("age is 12 ");
	 }
}