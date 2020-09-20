package practise;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Choicesmenu {
	public static void main(String[] args) {
		
		int choice;
		int var=5;
	     Scanner sc=new Scanner(System.in);
	   
	       while(var>0)
	       {      System.out.println("enter your choice");
	    	   choice=sc.nextInt();
	     switch (choice) 
	     {
	     case 1:JOptionPane.showMessageDialog(null, "hello elon");break;
	     case 2:System.out.println("jack ma");break;
	     case 3:System.out.println("mark jykarberg");break;
	    	 
		}
	     JOptionPane.showMessageDialog(null,"1.elon musk\n2.jack ma\n3.mark jukarberg\n4.exit");
	   
		     if(choice==4)
		    	 break;
	       }
	      System.out.println("ok vishal your work has been done:");
	}

}
