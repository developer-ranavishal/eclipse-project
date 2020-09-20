package file_handling;
import java.io.File;
import java.io.IOException;
public class Filedemo 
{
   public static void main(String[] args) throws IOException {
	
	   File f=new File("C:\\MAMP\\htdocs\\demo.html");
	   System.out.println("file can exist "+f.exists());
	   System.out.println("file can execute "+f.canExecute());
	   System.out.println("file readable or not "+f.canRead());
	   System.out.println("file writeable or not "+f.canWrite());
	   System.out.println("file name "+f.getName());
	   System.out.println("file size in bytes "+f.length());
	   System.out.println();
	   System.out.println();
	   System.out.println("we will create our file ");
	   File f1=new File("C:\\MAMP\\hello.text");
  System.out.println("create new file: "+f1.createNewFile());
  // above statement require to throw or handle IOException
	   System.out.println("file exist:"+f1.exists());                        
	   System.out.println("file can read:"+f1.canRead());    
	   System.out.println("file can write:"+f1.canWrite());
	   System.out.println("file can execute:"+f1.canExecute());
	   System.out.println("file size:"+f1.length());
	   System.out.println("file in directory "+f1.isDirectory());
	   System.out.println("file path is absolute "+f1.isAbsolute());
	   System.out.println("is type file "+f1.isFile());
	   System.out.println("file is hidden "+f1.isHidden());
	   System.out.println("list files "+f1.listFiles());
	   System.out.println("mk dir "+f1.mkdir());
	   
	   
}
}
