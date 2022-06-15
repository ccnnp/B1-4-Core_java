package framework;

public abstract class SavingAcc extends BankAcc
{
	private static boolean isSalaried;
	
	private static final float MINBAL = 1200.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, getAccNm(), accBal);
		this.isSalaried = isSalaried;
	}
	
	public static boolean getisSalaried() {
		return isSalaried;
	}
	public static float getMINBAL() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc[getMINBAL"+getMINBAL()+"getisSalaried"+getisSalaried()+"toString()="+super.toString()+"]";
	}

}
