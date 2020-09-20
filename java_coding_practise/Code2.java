package java_coding_practise;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter value of x");
      int x=sc.nextInt();
      if(x%2!=0)
    	  System.out.println("Hello");
      else if(x%2==0 && (x>=0 && x<=10))
    	  System.out.println("Hi");
      else if(x>=10 && x<=20)
    	  System.out.println("Hello");
      if(x>20)
    	  System.out.println("Bye");
		
	}

}
