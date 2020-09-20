package file_handling;

import java.io.*;

public class FileWrite 
{
	public static void main(String[] args) throws IOException {
	 String s="131354";	
 FileOutputStream fo=new FileOutputStream("C:\\Users\\vishal\\Documents\\java\\vishal.txt",true);
      char[] ch=s.toCharArray();  //{'1','3','1','3',.....}     
    for(int i=0;i<s.length();i++)
         fo.write(ch[i]);
          fo.write(1000);
         fo.close();
         System.out.println("successfully written in file");
         
	}

}
