package package5;

public class SBI1 
{
	private int balance;
	private SBI1(int bal)
	{
		balance=bal;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int bal)
	{
		bal=balance;
	}
	public void display()
	{
		System.out.println(balance);
	}
}
