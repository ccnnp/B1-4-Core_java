package application;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static float charges;
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		GSPrimeAcc.charges=charges;
	}
	@Override
	public void bookProduct(float charges) {
		System.out.println("Account No: "+PrimeAcc.getAccNo()+"\n"+"Account Name: "+PrimeAcc.getAccNm()+"\n"+"Charges: "+charges+"\n"+"Delivery Charges: "+PrimeAcc.getDeliverycharges());
	}
	
	public float getCharges() {
		return GSPrimeAcc.charges;
	}
	public static void setCharges(float charges) {
		GSPrimeAcc.charges = charges;
	}
	@Override
	public void items(float item_id) {    
	}
	@Override
	public String toString() {
		return "GSPrimeAcc[toString()="+super.toString()+",getCharges()="+getCharges()+"]";
	}
}
