//serialization is a process for transfering obj from jvm1 to jvm2
package serialization;
import java.io.*;
public class Demoserilization 
{
	public static void main(String[] args) throws IOException {
		Student st=new Student(19, "vishal rana");
     ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Users\\vishal\\Documents\\java file\\object.txt")) ;
	out.writeObject(st);//serialize the object
	out.close();		
	}
}
class Student implements Serializable  //it must implement this interface to serialized the student object
{
	int age;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
		
}
