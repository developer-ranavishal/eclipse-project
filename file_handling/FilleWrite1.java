package file_handling;
import java.io.*;
public class FilleWrite1 
{
	public static void main(String[] args) throws IOException {
		
	  File fi=new File("C:\\Users\\vishal\\Documents\\java file\\test.txt");
	  System.out.println("create new file "+fi.createNewFile());
	  System.out.println("file size "+fi.length());

	  FileOutputStream fo=new FileOutputStream(fi);
	  String s="vishal rana from kota saharanpur:";
	  String s1="hello india";
	  byte b[]=s.getBytes();
	   fo.write(b);
	   char c[]=s1.toCharArray();
	   System.out.println();
	   for(char i : c)
		  fo.write(i);
	    fo.close();
	  System.out.println("finished writing ");
	  
	  
	  }

}
