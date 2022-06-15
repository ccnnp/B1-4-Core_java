package application;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static float MINBAL;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, getAccNm(), accBal, isSalaried);
		MMSavingAcc.MINBAL=MINBAL;
	}
	
	@Override
	public void withdraw(float amount) {
		System.out.println("Account No: "+SavingAcc.getAccNo()+"\n"+"Account Name: "+SavingAcc.getAccNm()+"\n"+"Account Balance: "+SavingAcc.getAccBal()+"\n"+"isSalaried: "+SavingAcc.getisSalaried());
	}
	public float getaccBal() {
		return MMSavingAcc.getAccBal();
	}
	public static void setaccBal(float accBal) {
		MMSavingAcc.MINBAL = accBal;
	}
	
	@Override
	public void deposite(float amount) {		
	}
	@Override
	public String toString() {
		return "GSPrimeAcc[toString()="+super.toString()+",getMINBAL()="+getMINBAL()+"]";
	}

	
	
	
}
