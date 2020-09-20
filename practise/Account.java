package practise;
import java.util.*;
 class CheckBank
{
	private long acc_number=170240101047L;
	private int acc_balance=450000;
	private String name="vishal rana";
	String name1;
	long accnumber;
	public void setaccountdetail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the name :");
		 name1=sc.nextLine();
		System.out.println("please enter the account number :");
		 accnumber=sc.nextLong();
	}
	public int getbalance()
	{ 
		int balance;
		if((name.equalsIgnoreCase(name1)) && (acc_number==accnumber))
		{
			System.out.println("your account balance is ");
			balance=acc_balance;
		}
		else
		{
			System.out.println("you have entered wrong detail");
			balance=0;
		}
		
		return balance;			
	}
	}
public class Account extends CheckBank
{
	public static void main(String[] args) {
		
		CheckBank e=new CheckBank();  
		e.setaccountdetail();
		System.out.println(e.getbalance());
		
	}
}


