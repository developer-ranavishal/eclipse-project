package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Employee {

	int Rollno;
	String name;
	
	public Employee(int rollno, String name) {
	
		Rollno = rollno;
		this.name = name;
	}
	public void printdata()
	{
		System.out.println(Rollno+"\t"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 Employee arr[]=new Employee[5];
	 for (int i = 0; i < arr.length; i++) {
		 try
			{
		 System.out.println("enter the id of employee: ");
		int rollno=Integer.parseInt(br.readLine());
		System.out.println("enter the name of employeee: ");
		String name=br.readLine();
		arr[i]=new Employee(rollno, name);
		}
		catch (IOException e) {
		
			System.out.println(" exception is normal :"+e.toString());
		}
			
	}
	 for (int i = 0; i < arr.length; i++) {
		
		 arr[i].printdata();
	}
		

	}

}
