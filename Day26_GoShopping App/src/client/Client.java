package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Client {

	public static void main(String[] args) 
	{
		
		ShopFactory obj=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(5240,"Srinidhi",0.0f,true);
		NormalAcc n=new GSNormalAcc(5942,"Chandana",140.0f,0.0f);
		System.out.println("Prime Account: ");
		p.bookProduct(760.0f);
		System.out.println();
		System.out.println("Normal Account: ");
		n.bookProduct(900.0f);
		System.out.println(p);
		System.out.println();
		System.out.println(n);
	}

}
