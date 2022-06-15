package framework;

public abstract class CurrentAcc extends BankAcc
{
	
	private static float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		CurrentAcc.creditLimit = creditLimit;
	}
	public static float getcreditLimit() {
		return creditLimit;
	}
	@Override
	public String toString() {
		return "CurrentAcc[getcreditLimt"+getcreditLimit()+"toString()="+super.toString()+"]";
	}
	
}
