package framework;

public abstract class NormalAcc extends ShopAcc
{
	private static float deliveryCharges = 0;

	public NormalAcc(int accNo,String accNm,float deliveryCharges,float charges) 
	{
		super(accNo,accNm,charges);
		NormalAcc.deliveryCharges=deliveryCharges;
	}

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}
	@Override
	public String toString() {
		return "NormaAcc[getCharges()="+getCharges()+"getDeliveryCharges"+getDeliveryCharges()+"toString()="+super.toString()+"]";
	}
}
