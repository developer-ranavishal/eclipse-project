package file_handling;

import java.io.*;

public class File_read
{
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi;
		 fi=new FileInputStream("C:\\Users\\vishal\\Documents\\java file\\test.txt");
	// System.out.println((char)fi.read());
		 int i;
		 while ((i=fi.read())!=-1) 
		 {
			System.out.print((char)i);//it read all character from the file
		}
	
	    fi.close();	
		
	}

}
