package framework;

public abstract class ShopFactory 
{
	public abstract PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo,String accNm,float deliveryCharges,float charges);
}
