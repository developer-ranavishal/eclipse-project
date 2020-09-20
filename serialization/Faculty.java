package serialization;
import java.io.*;
class Faculty implements Serializable
{
  public static void main(String[] args) throws IOException,ClassNotFoundException {
	
  ObjectInputStream in;
  in=new ObjectInputStream(new FileInputStream("C:\\Users\\vishal\\Documents\\java file\\object.txt"));
  Student s1=(Student)in.readObject();
  System.out.println(s1);

}
}
