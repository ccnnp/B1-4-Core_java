package application;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		return null;
	}
	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float deliveryCharges, float charges) {
		return null;
	}
	
}
