package application;

import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	@Override
	public void withdraw(float amount) {
		System.out.println("Account No: "+CurrentAcc.getAccNo()+"\n"+"Account Name: "+CurrentAcc.getAccNm()+"\n"+"Account Balance: "+CurrentAcc.getAccBal()+"\n"+"Credit limit: "+CurrentAcc.getcreditLimit());
		
	}

	@Override
	public void deposite(float amount) {
	}

	@Override
	public String toString() {
		return "MMCurrentAcc[toString()="+super.toString()+",getaccBal()="+getAccBal()+"]";
	}
	
}
