package practise;
public class EncapsulationDemo extends Bank
{

	public static void main(String[] args) 
	{
	/* Bank b=new Bank();
	b.set("vishal rana", 1200, 400);
	b.get();  */
		EncapsulationDemo e=new EncapsulationDemo();
		e.setValue("vishal rana", 1200, 400,false);
		System.out.println(e.getname());
		System.out.println(e.getbalance());
		System.out.println(e.getdeposit());
		System.out.println(e.atm);
	
		
		
	
	}
}

 class Bank
{
	private String name="rana vishal";
	private int balance=11233;
	private int deposit=3456;
	boolean atm=true;
	 public void setValue(String name, int balance, int deposit, boolean atm) {
		this.name = name;
		this.balance = balance;
		this.deposit = deposit;
		this.atm=atm;
	}
	public String getname()
	{
		return name;
	}
	public int getbalance()
	{
		return balance;
	}
	public int getdeposit()
	{
		return deposit;
	}
	public boolean getatm()
	{
		return atm;
	}
}
