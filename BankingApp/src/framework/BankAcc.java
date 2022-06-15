package framework;

public abstract class BankAcc 
{
	private static int accNo;
	private static String accNm;
	private static float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		BankAcc.accNo = accNo;
		BankAcc.accNm = accNm;
		BankAcc.accBal = accBal;
	}
	public abstract void withdraw(float amount);
	public abstract void deposite(float amount);
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, getAccNm(), accBal);
	}
	public static int getAccNo() {
		return accNo;
	}
	public static String getAccNm() {
		return accNm;
	}
	public static void setAccNm(String accNm) {
		BankAcc.accNm = accNm;
	}
	public static float getAccBal() {
		return accBal;
	}
	
}
