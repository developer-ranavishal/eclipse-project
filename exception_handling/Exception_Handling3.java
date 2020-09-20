package exception_handling;
import java.io.IOException;
import java.io.File;
public class Exception_Handling3
{

	public static void main(String[] args) 
	{
		try
		{
	     File f=new File("C:\\Users\\vishal\\Documents\\java\\Demo.java");	
	      System.out.println("file exist "+f.exists());
	      System.out.println("create new class "+f.createNewFile());
	  System.out.println("hello jio");
		}
		catch (IOException e) {
			System.out.println("this is exception "+e.getMessage());
		}
		}	
		}
