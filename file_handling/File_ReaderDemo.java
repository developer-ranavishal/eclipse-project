package file_handling;
import java.io.*;
public class File_ReaderDemo 
{
	public static void main(String[] args) throws IOException {
		
		FileReader fr;
		fr=new FileReader("C:\\Users\\vishal\\Documents\\java file\\write.txt");
		int i;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
		
	}
	fr.close();
		
	}

	
}
