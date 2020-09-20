package file_handling;
import java.io.*;
public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException{
		
		FileWriter fw;
		fw=new FileWriter("C:\\Users\\vishal\\Documents\\java file\\write.txt");
		String s="hello alien how are you: ";
		 String s1="131234";
		fw.write(s);
	    fw.write(s1);	
		fw.close();
	}

}
